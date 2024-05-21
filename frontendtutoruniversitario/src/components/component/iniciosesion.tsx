
'use client';

import Link from 'next/link';
import { Routes } from 'react-router-dom';

interface Props {
  // Add props type definitions here
}

const Iniciosesion: React.FC<Props> = () => {
  return (
    <div className="flex min-h-screen items-center justify-center bg-gray-100 dark:bg-gray-950">
      <div className="mx-auto w-full max-w-md space-y-8">
        <Header />
        <Form />
        <Link href="">
          <RegistroButton />
        </Link >
      </div>
    </div>
  );
};

const Header = () => {
  return (
    <div>
      <h2 className="mt-6 text-center text-3xl font-bold tracking-tight text-gray-900 dark:text-gray-50">
        Bienvenido a TutorUniversitario
      </h2>
      <p className="mt-2 text-center text-sm text-gray-600 dark:text-gray-400">
        Inicia sesión o regístrate para comenzar
      </p>
    </div>
  );
};

const Form = () => {
  return (
    <form action="#" className="space-y-6" method="POST">
      <Input label="Correo electrónico" type="email" name="email" />
      <Input label="Contraseña" type="password" name="password" />
      <SubmitButton />
      <RememberMe />
    </form>
  );
};

const Input = ({ label, type, name }: { label: string; type: string; name: string }) => {
  return (
    <div>
      <label className="block text-sm font-medium text-gray-700 dark:text-gray-300" htmlFor={name}>
        {label}
      </label>
      <div className="mt-1">
        <input
          autoComplete={type === 'email' ? 'email' : 'current-password'}
          className="block w-full appearance-none rounded-md border border-gray-200 border-gray-300 px-3 py-2 placeholder-gray-400 shadow-sm focus:border-indigo-500 focus:outline-none focus:ring-indigo-500 sm:text-sm dark:bg-gray-800 dark:text-gray-50 dark:placeholder-gray-400 dark:focus:border-indigo-500 dark:border-gray-800"
          id={name}
          name={name}
          required
          type={type}
        />
      </div>
    </div>
  );
};

const SubmitButton = () => {
  return (
    <div>
      <button
        className="flex w-full justify-center rounded-md border border-gray-200 border-transparent bg-indigo-600 py-2 px-4 text-sm font-medium text-white shadow-sm hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-indigo-500 focus:ring-offset-2 dark:bg-indigo-500 dark:hover:bg-indigo-600 dark:focus:ring-indigo-600 dark:border-gray-800"
        type="submit"
      >
        Iniciar sesión
      </button>
    </div>
  );
};

const RememberMe = () => {
  return (
    <div className="flex items-center justify-between">
      <div className="flex items-center">
        <input
          className="h-4 w-4 rounded border-gray-300 text-indigo-600 focus:ring-indigo-500 dark:border-gray-600 dark:bg-gray-800 dark:ring-offset-gray-800 dark:focus:ring-indigo-600"
          id="remember-me"
          name="remember-me"
          type="checkbox"
        />
        <label className="ml-2 block text-sm text-gray-900 dark:text-gray-300" htmlFor="remember-me">
          Recuérdame
        </label>
      </div>
    </div>
  );
};

const RegistroButton = () => {
  return (
    <button
      className="flex w-full justify-center rounded-md border border-gray-200 border-transparent bg-green-600 py-2 px-4 text-sm font-medium text-white shadow-sm hover:bg-green-700 focus:outline-none focus:ring-2 focus:ring-green-500 focus:ring-offset-2 dark:bg-green-500 dark:hover:bg-green-600 dark:focus:ring-green-600 dark:border-gray-800"
      type="button"
    >
      Registrarse
    </button>
  );
};

export default Iniciosesion;