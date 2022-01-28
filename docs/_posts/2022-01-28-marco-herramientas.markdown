---
layout: post
title:  "Propuesta de marco de herramientas"
date:   2022-01-28 19:00:19 +0200
categories: propuestas
---

Hoy ha tenido lugar la segunda reunión de coordinación de nuestro grupo de trabajo. Hemos revisado [las preguntas en la encuesta](https://ies-rafael-alberti.github.io/GT-DVIA-21-22/assets/html/encuesta-analisis-materiales.html) para analizar los cursos de formación que se han realizado durante el primer trimestre sobre los nuevos cursos de especialización. Pero la mayor parte del tiempo se ha dedicado a la [propuesta de marco de herramientas para la creación de materiales didácticos]({{ "/assets/pdf/propuesta-marco-herramientas.pdf" | relative_url }}).

![Videconferencia de la segunda reunión]({{ "/assets/images/reunion2-meet.png" | relative_url }})

Las herramientas que proponemos se han elegido en base a los siguientes criterios:

- **Formatos y código abierto**. Todas las herramientas son open source y el formato en el que se almacenan las creaciones no es propietario. Esto permite que puedan integrarse en múltiples entornos de aprendizaje.
- **Propuesta común y ampliable**. Consideramos importante que los materiales se elaboren siguiendo unas directrices y plantillas comunes, para dar homogeneidad al repositorio. Pero tampoco queremos coartar la creatividad de ninguna forma, por lo que están en continúo proceso de amplicación y mejora, así que las herramientas deben proporcionar esa flexibilidad.
- **Facilidad de transformación**. Siguiendo con la idea de la apertura a la posibilidad de ampliaciones y cambios, las creaciones deben poderse transformar entre varios formatos, con el fin de no tener que volver a maquetar un trabajo previamente realizado.
- **Estabilidad temporal**. La visualización de los materiales creados con las herramientas que se proponen no está supeditada a la presencia de una empresa o servidor en línea particular.
- **Interactividad y accesibilidad**. Hemos buscado herramientas que no solamente generen materiales interactivos que fomenten la motivación para consultarlos, sino que también tengan en cuenta los estándares de accesibilidad.
- **Diseño Universal de Aprendizaje (DUA)**. De forma que el alumnado tenga acceso a distintos tipos de recursos para ayudarle a comprender un concepto concreto y mantener la motivación por el aprendizaje.

![Presentación del marco de herramientas]({{ "/assets/images/reunion2-marco.png" | relative_url }})

En la propuesta, los materiales didácticos que pueden crearse se dividen en las siguientes categorías:

- **Material de referencia**. Este tipo de material es la versión digital, interactiva y viva de un libro de texto tradicional. Aúna en un solo lugar, y con posibilidad de índices múltiples y clasificación, los apuntes sobre una materia concreta con todo tipo de recursos integrados y susceptible de convertirse en el cuaderno de aprendizaje personal del alumnado. Proponemos utilizar [TiddlyWiki](https://tiddlywiki.com).
- **Unidad didáctica desarrollada**. Consiste en un contenido completamente guiado, extraído del material de referencia y aplicado a un caso concreto, construido para alcanzar unos objetivos dentro de una unidad didáctica. Se integra dentro del entorno de aprendizaje y se puede extraer información del avance del alumnado. La herramienta propuesta es [eXeLearning](https://exelearning.net).
- **Actividades interactivas**. Actividades de distinto tipo: vídeo interactivo, preguntas tipo test, itinerarios ramificados mostrando diferentes contenidos en función de las respuestas del alumnado... que puedan incorporarse en el material de referencia y en la unidad didáctica desarrollada. Elegimos [el conjunto de herramientas H5P](https://h5p.org) para este tipo de contenido.
- **Guiones de evaluación**. A la hora de elaborar instrucciones para los diferentes trabajos, proyectos o pruebas de evaluación, consideramos que usar el lenguaje Markdown con unos estilos comunes aplicados permite ajustarlas rápidamente a cada grupo y curso. Para facilitar la redacción podemos ayudarnos de herramientas como [Madoko](https://www.madoko.net).
- **Guías técnicas**. Si queremos elaborar una guía con instrucciones paso a paso para replicar un procedimiento técnico, como una práctica, podemos redactarla en Markdown y generarla en forma de [CodeLab](https://davidlms.github.io/Practicas/crear-codelab/#0) para facilitar su mantenimiento y obtener una visualización agradable y adaptativa a todo tipo de dispositivos.
- **Cuadernos interactivos de código**. Los cuadernos interactivos de código permiten al alumnado aprender a realizar determinados procedimientos en un lenguaje de programación de forma interactiva, editable y ejecutando ejemplos en tiempo real, sin necesidad de instalar ningún entorno de desarrollo. Proponemos utilizar [Jupyter](https://jupyter.org) para elaborarlos en combinación con [Binder](https://mybinder.org) para facilitar su visualización y ejecución.

Esta propuesta aún no está cerrada, por lo que te animamos a discutir sobre la misma y aportar tus opiniones en [el hilo habilitado en el repositorio](https://github.com/IES-Rafael-Alberti/GT-DVIA-21-22/discussions/3).

Recuerda que puedes acceder al material generado por el GT y al foro de discusión en los siguientes enlaces:
- [Repositorio del GT](https://github.com/IES-Rafael-Alberti/GT-DVIA-21-22)
- [Foro de discusión del GT](https://github.com/IES-Rafael-Alberti/GT-DVIA-21-22/discussions)

Si tienes cualquier sugerencia de mejora, indicar un error o colaborar de alguna forma, anímate [creando un issue en el repositorio](https://github.com/IES-Rafael-Alberti/GT-DVIA-21-22/issues/new).

Hemos comenzado a recopilar estadísticas de acceso a este blog, para conocer el alcance de su difusión. Para ello hemos elegido [Plausible](https://plausible.io), por ser una alternativa europea de código abierto a otras herramientas más populares, centrada en la privacidad de los visitantes, que no utiliza cookies y cumple de forma estricta con la legislación de protección de datos. Siguiendo nuestra filosofía de apertura, [los datos son públicamente accesibles](https://plausible.io/ies-rafael-alberti.github.io%2Fgt-dvia-21-22) para que los pueda consultar cualquier persona interesada.