(ns estoque.aula3)

(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))
(println (aplica-desconto? 1000))
(println (aplica-desconto? 100))


(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [aplica-desconto? valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))


(println "Função sem nome")


(println (valor-descontado aplica-desconto? 1000))
(println (valor-descontado  aplica-desconto? 100))

(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 1000))
(println (valor-descontado  (fn [valor-bruto] (> valor-bruto 100)) 100))


