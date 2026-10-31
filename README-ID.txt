ANUBIS CLIENT MOBILE BETA 0.1 — FONDASI

Target:
- Minecraft Java Edition 1.21.11
- Fabric Loader 0.19.3
- Fabric API 0.141.6+1.21.11
- Java 21
- Android launcher: Mojo Launcher

ISI BUILD INI:
- Entrypoint Fabric client
- Penyimpanan konfigurasi anubis-mobile.json
- Kerangka Module Manager
- Daftar modul placeholder
- GitHub Actions untuk membangun file JAR secara online

PENTING:
Ini adalah fondasi awal, BELUM berisi Click GUI, ESP, waypoint aktif,
atau fitur cheat lainnya. Modul yang terdaftar masih placeholder.
Jangan menganggap build berhasil sebelum GitHub Actions selesai hijau.

CARA BUILD LEWAT ANDROID:
1. Buat repository GitHub baru bernama AnubisMobile.
2. Ekstrak ZIP ini di HP.
3. Unggah seluruh ISI folder AnubisMobile ke root repository (jangan unggah
   folder luarnya saja sebagai satu folder bersarang).
4. Buka tab Actions di repository.
5. Pilih workflow "Build Anubis Mobile", lalu tekan Run workflow.
6. Jika selesai sukses, buka hasil workflow dan unduh artifact
   AnubisMobile-Beta-0.1.
7. Ekstrak artifact ZIP untuk mendapatkan file JAR.

INSTALASI:
Salin JAR hasil build ke folder mods milik instance Minecraft 1.21.11
di Mojo Launcher. Pastikan Fabric API versi 1.21.11 juga terpasang.
Backup dunia sebelum pengujian.

Jika build gagal, kirim screenshot bagian error merah dari GitHub Actions.
