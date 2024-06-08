document.addEventListener('DOMContentLoaded', async function () {
    const tutorId = window.location.pathname.split('/').pop();
    try {
        const response = await fetch(`/api/tutores/${tutorId}`);
        if (response.ok) {
            const tutor = await response.json();
            document.getElementById('tutorInfo').innerHTML = `
                <p>Nombre: ${tutor.nombre}</p>
                <p>Apellido: ${tutor.apellido}</p>
                <p>Email: ${tutor.email}</p>
                <p>Teléfono: ${tutor.telefono}</p>
                <p>Descripción: ${tutor.descripcion}</p>
                <p>Horarios Disponibles: ${tutor.horariosDisponibles}</p>
            `;
        } else {
            alert('No se pudo cargar la información del tutor.');
        }
    } catch (error) {
        console.error('Error al cargar la información del tutor:', error);
        alert('Ocurrió un error al cargar la información del tutor.');
    }
});
