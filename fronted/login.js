document.getElementById('loginForm').addEventListener('submit', async function (event) {
    event.preventDefault();
    const email = document.getElementById('email').value;

    try {
        const response = await fetch('http://localhost:8080/api/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ email })
        });

        console.log('Response status:', response.status);

        if (response.ok) {
            const result = await response.json();
            console.log('Response data:', result);
            if (result.role === 'tutor') {
                const tutor = result.data;
                window.location.href = `http://localhost:5500/tutor/${tutor.id}`;
            } else if (result.role === 'estudiante') {
                window.location.href = 'http://localhost:5500/estudiante/tutores';
            }
        } else {
            alert('Login fallido. Por favor, verifica tu correo electrónico.');
        }
    } catch (error) {
        console.error('Error en el login:', error);
        alert('Ocurrió un error. Por favor, intenta de nuevo.');
    }
});
