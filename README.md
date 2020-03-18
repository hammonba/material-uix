# material-uix
Material UI in a UIX app

```
clj -A:dev watch uix
clj -Sdeps '{:deps {nrepl {:mvn/version "0.6.0"}}}' -m nrepl.cmdline --connect --host localhost --port 40177
```
or
```
npx shadow-cljs watch uix
npx shadow-cljs cljs-repl uix
```
