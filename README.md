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

```bash
$ rustc --target wasm32-wasi hello.rs -o hello.wasm
$ wasmtime hello.wasm 
```

