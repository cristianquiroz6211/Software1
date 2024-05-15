import Link from "next/link";

const RegistrationForm = () => {
  const inputClasses =
    "block w-full appearance-none rounded-md border border-gray-200 border-gray-300 px-3 py-2 placeholder-gray-400 shadow-sm focus:border-indigo-500 focus:outline-none focus:ring-indigo-500 sm:text-sm dark:bg-gray-800 dark:text-gray-50 dark:placeholder-gray-400 dark:focus:border-indigo-500 dark:border-gray-800";

  const labelClasses = "block text-sm font-medium text-gray-700 dark:text-gray-300";

  return (
    <form action="#" className="space-y-6" method="POST">
      <div>
        <label className={labelClasses} htmlFor="name">
          Nombre
        </label>
        <div className="mt-1">
          <input
            autoComplete="name"
            className={inputClasses}
            id="name"
            name="name"
            required
            type="text"
          />
        </div>
      </div>
      <div>
        <label className={labelClasses} htmlFor="lastName">
          Apellido
        </label>
        <div className="mt-1">
          <input
            autoComplete="lastName"
            className={inputClasses}
            id="lastName"
            name="lastName"
            required
            type="text"
          />
        </div>
      </div>
      <div>
        <label className={labelClasses} htmlFor="email">
          Correo electrónico
        </label>
        <div className="mt-1">
          <input
            autoComplete="email"
            className={inputClasses}
            id="email"
            name="email"
            required
            type="email"
          />
        </div>
      </div>
      <div>
        <label className={labelClasses} htmlFor="password">
          Contraseña
        </label>
        <div className="mt-1">
          <input
            autoComplete="current-password"
            className={inputClasses}
            id="password"
            name="password"
            required
            type="password"
          />
        </div>
      </div>
      <div>
        <label className={labelClasses} htmlFor="phone">
          Teléfono
        </label>
        <div className="mt-1">
          <input
            autoComplete="tel"
            className={inputClasses}
            id="phone"
            name="phone"
            required
            type="tel"
          />
        </div>
      </div>
      <div>
        <label className={labelClasses} htmlFor="role">
          Rol
        </label>
        <div className="mt-1">
          <select
            className="block w-full appearance-none rounded-md border border-gray-200 border-gray-300 px-3 py-2 placeholder-gray-400 shadow-sm focus:border-indigo-500 focus:outline-none focus:ring-indigo-500 sm:text-sm dark:bg-gray-800 dark:text-gray-50 dark:placeholder-gray-400 dark:focus:border-indigo-500 dark:border-gray-800"
            id="role"
            name="role"
            required
          >
            <option value="">Selecciona un rol</option>
            <option value="student">Estudiante</option><option value="tutor">Tutor</option>
          </select>
        </div>
      </div>
      <div>
        <button
          className="flex w-full justify-center rounded-md border border-gray-200 border-transparent bg-green-600 py-2 px-4 text-sm font-medium text-white shadow-sm hover:bg-green-700 focus:outline-none focus:ring-2 focus:ring-green-500 focus:ring-offset-2 dark:bg-green-500 dark:hover:bg-green-600 dark:focus:ring-green-600 dark:border-gray-800"
          type="submit"
        >
          Registrarse
        </button>
      </div>
      <div className="text-center">
        <Link
          className="text-sm font-medium text-green-600 hover:text-green-500 dark:text-green-500 dark:hover:text-green-400"
          href="./iniciosesion"
        >
          ¿Ya tienes una cuenta? Inicia sesión
        </Link>
      </div>
    </form>
  );
};

export function Registro() {
  return (
    <div className="flex min-h-screen items-center justify-center bg-gray-100 dark:bg-gray-950">
      <div className="mx-auto w-full max-w-md space-y-8">
        <div>
          <h2 className="mt-6 text-center text-3xl font-bold tracking-tight text-gray-900 dark:text-gray-50">
            Bienvenido a TutorUniversitario
          </h2>
          <p className="mt-2 text-center text-sm text-gray-600 dark:text-gray-400">Regístrate para comenzar</p>
        </div>
        <RegistrationForm />
      </div>
    </div>
  );
}