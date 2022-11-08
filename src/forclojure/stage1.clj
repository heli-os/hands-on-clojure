(ns forclojure.stage1)

; answer을 정확하게 고쳐봅니다.

; Functions
; https://4clojure.oxal.org/#/problem/14

(comment
  (def answer14 8)

  (= answer14 ((fn add-five [x] (+ x 5)) 3))
  (= answer14 ((fn [x] (+ x 5)) 3))
  (= answer14 (#(+ % 5) 3))
  (= answer14 ((partial + 5) 3)))

; Hello World
; https://4clojure.oxal.org/#/problem/16

(comment
  (defn answer16
    [name]
    (str "Hello, " name "!"))

  (= (answer16 "Dave") "Hello, Dave!")
  (= (answer16 "Jenn") "Hello, Jenn!")
  (= (answer16 "Rhea") "Hello, Rhea!"))

; map
; https://4clojure.oxal.org/#/problem/17

(comment
  (def answer17 '(6 7 8))

  (= answer17 (map #(+ % 5) '(1 2 3))))

; filter
; https://4clojure.oxal.org/#/problem/18

(comment
  (def answer18 '(6 7))

  (= answer18 (filter #(> % 5) '(3 4 5 6 7))))
