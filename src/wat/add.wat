(module
 (func $log (import "imports" "log_func") (param i32))

 (func $getAnswer (result i32)
       i32.const 42
       (call $log)
       i32.const 42)
 
 (export "getAnswer" (func $getAnswer))

 (func (export "add") (param $a i32) (param $b i32) (result i32)
       (call $getAnswer)
       (local.get $a)
       (i32.add)
       (local.get $b)
       (i32.add)))

