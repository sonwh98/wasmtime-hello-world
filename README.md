Simple example of compiling rust to WASM to execute in Wasmtime

- install rust https://www.rust-lang.org/tools/install
```bash
$ curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh
```
- install wasmtime https://docs.wasmtime.dev/cli-install.html
```bash
$ curl https://wasmtime.dev/install.sh -sSf | bash
```
- add wasi
```bash
$ rustup target add wasm32-wasi
```
- compile rust to wasm and execute with wasmtime
```bash
$ rustc --target wasm32-wasi hello.rs -o hello.wasm
$ wasmtime hello.wasm 
```
- install https://github.com/WebAssembly/wabt
```bash
$ brew install wabt
```

wat2wasm simple.wat -o simple.wasm

hexdump -C simple.wasm

wasmtime add.wat --invoke add 1 2

brew install wasm3
wasm3 --repl add.wasm
