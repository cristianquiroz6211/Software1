document.addEventListener('DOMContentLoaded', async function () {
    try {
        const response = await fetch('/api/estudiantes/tutores');
        if (response.ok) {
            const tutores = await response.json();
            const tutoresList = document.getElementById('tutoresList');
            tutoresList.innerHTML = '';
            tutores.forEach(tutor => {
                tutoresList.innerHTML += `
                    <div>
                        <h3>${tutor.nombre} ${tutor.apellido}</h3>
                        <p>Email: ${tutor.email}</p>
                        <p>Teléfono: ${tutor.telefono}</p>
                        <p>Descripción: ${tutor.descripcion}</p>
                        <p>Horarios Disponibles: ${tutor.horariosDisponibles}</p>
                    </div>
                    <hr>
                `;
            });
        } else {
            alert('No se pudo cargar la lista de tutores.');
        }
    } catch (error) {
        console.error('Error al cargar la lista de tutores:', error);
        alert('Ocurrió un error al cargar la lista de tutores.');
    }
});
