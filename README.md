Simple example of compiling rust to WASM to execute in Wasmtime

```bash
rustc --target wasm32-wasi hello.rs -o hello.wasm
wasmtime hello.wasm 
```

