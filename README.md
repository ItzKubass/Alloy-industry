# Alloy Industry

A Mindustry Java mod that adds new industrial blocks, including alloy conveyors, bridges, a large kiln, and a medium solar panel.

## Blocks

- **Alloy Conveyor**: A fast mid-tier conveyor.
- **Alloy Bridge**: A bridge designed for Alloy Conveyors.
- **Large Kiln**: An enlarged version of the Kiln for faster metaglass production.
- **Medium Solar Panel**: A moderate power source, more efficient than the standard solar panel.

## Building

Requires JDK 17. For Android compatibility, the Android SDK is needed.

### Desktop Testing

```bash
./gradlew jar
```

The output jar is in `build/libs`. Desktop testing only – will not work on Android.

### Universal (Android + Desktop)

Use GitHub Actions, or build locally with:

```bash
./gradlew deploy
```

## Installation

1. Download the latest `.jar` from the Releases page.
2. Place it in your Mindustry mods folder.
3. Restart the game.

## License

This project is licensed under the MIT License – see the [LICENSE](LICENSE) file for details.