# AGAHI Studio 4 — Android Studio Project

This is an Android Studio source project prepared from the existing AGAHI Studio 4 Android prototype, with the requested music-selection workflow added.

## Project details

- Package: `com.agahi.studio4`
- Version: `0.2.0-music-brief`
- Minimum Android: 8.0 (API 26)
- Compile / target SDK: 35
- JDK: 17
- UI: Kotlin + Jetpack Compose

## Included in this source package

- Headlines, Breaking News and Vlog modes.
- Editable video title and Urdu narration script.
- Audio document pickers for narration and each music slot.
- Persistent URI references for audio selected on the device.
- Music brief displayed in the app:
  - Headlines: Selection A
  - Breaking News: Selection D
  - Vlog: keep existing selection
- GitHub Actions workflow to compile a debug APK.

## Important music and licensing note

The letters A and D identify your requested selections, but do not identify actual audio files. This project does not bundle music. Select the corresponding audio files from the providers' official sites or from files you are licensed to use. Confirm that the licence allows synchronization with video, distribution, and monetization where applicable. The app cannot verify a licence automatically. The existing Vlog track must be supplied from your existing project/device if it is not already available locally.

## Current implementation boundary

This package is a buildable source-project baseline for project text and audio selection. It is **not yet a finished video editor**. Video compositing, animated overlays, Urdu Nastaleeq rendering into frames, speech synthesis, timed captions, audio mixing/ducking, and MP4 export remain to be implemented and tested. The app does not claim to generate a finished video.

## Build with Android Studio

1. Extract this ZIP.
2. Open the extracted `AGAHI-Studio-4-Android` folder in Android Studio (Ladybug or newer).
3. Use JDK 17 when prompted.
4. Allow Gradle sync and install Android SDK Platform 35 if requested.
5. Select the `app` run configuration and run on an Android 8+ device or emulator.

## Build APK with GitHub Actions

1. Upload the extracted project files to your GitHub repository, preserving the folder structure.
2. Push to the `main` branch, or open **Actions** and run **Build AGAHI Studio 4 Android APK** manually.
3. Download the `AGAHI-Studio-4-Android` artifact from the successful workflow run. It contains the debug APK.

## Suggested next milestone

Implement and test a Media3/MediaCodec-based renderer with image/video backgrounds, title overlays, narration, background music mixing, caption timing, and MP4 export. Do not release until each music licence is confirmed.
