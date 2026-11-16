# BreatheMadrid

La pantalla **Datos semánticos** consulta el RDF del grupo mediante Apache Jena Fuseki y SPARQL. Instrucciones para iniciar el servidor, ejecutar Android y hacer la demo: [docs/SPARQL_ANDROID_INTEGRATION.md](docs/SPARQL_ANDROID_INTEGRATION.md).

Aplicación Android en Kotlin y Jetpack Compose para explorar las mediciones de calidad del aire de Madrid. Incluye una pantalla de inicio, un mapa con 23 estaciones con registros y fichas con gráficos horarios. Las lecturas incorporadas corresponden al 1 de octubre de 2026.

## Ejecutar

Abre esta carpeta como proyecto en Android Studio, sincroniza Gradle y ejecuta el módulo `app` en un dispositivo o emulador con Android 12 (API 31) o posterior. El proyecto compila con el SDK 37. El mapa base utiliza una conexión a Internet.

## Fuentes

- Ayuntamiento de Madrid, Dirección General de Sostenibilidad y Control Ambiental. [Estaciones de control](https://datos.madrid.es/dataset/212629-0-estaciones-control-aire) y [mediciones de calidad del aire](https://datos.madrid.es/dataset/212531-0-calidad-aire-tiempo-real), bajo [CC BY 4.0](https://creativecommons.org/licenses/by/4.0/). Group04 normalizó los registros. La app incorpora las observaciones horarias válidas y una selección de las últimas lecturas en JSON.
- Ayuntamiento de Madrid, [límites administrativos de los distritos](https://datos.madrid.es/dataset/900012-0-limites-administrativos-mapas), incorporados en GeoJSON.
- Cartografía de [OpenStreetMap y sus colaboradores](https://www.openstreetmap.org/copyright). Mapa interactivo con Leaflet, cuya licencia se incluye en `app/src/main/assets/map/leaflet-LICENSE.txt`.
