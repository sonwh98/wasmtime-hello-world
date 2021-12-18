fn main() {
    let mut count = 0u32;
    
    println!("let's count");
    loop{
        println!("{}", count);
        count+=1;
        if count == 3{
            println!("three");
            continue;
        }
        
        if count == 5{
            println!("that's enough");
            break;
        }
    }
    
}

//rustup target add wasm32-wasi
//rustc hello.rs --target wasm32-wasi
//wasmtime hello.wasm
