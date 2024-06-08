document.getElementById('loginForm').addEventListener('submit', async function (event) {
    event.preventDefault();
    const email = document.getElementById('email').value;

    try {
        const response = await fetch('/api/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ email })
        });

        if (response.ok) {
            const user = await response.json();
            if (user.hasOwnProperty('descripcion')) {
                // Es un tutor
                window.location.href = `/tutor/${user.id}`;
            } else {
                // Es un estudiante
                window.location.href = '/estudiante/tutores';
            }
        } else {
            alert('Login fallido. Por favor, verifica tu correo electrónico.');
        }
    } catch (error) {
        console.error('Error en el login:', error);
        alert('Ocurrió un error. Por favor, intenta de nuevo.');
    }
});
