(ns hoplon.hoplon)

(defn data-fn
  "Example data-fn handler.
  Result is merged onto existing options data."
  [_data]
  ;; returning nil means no changes to options data
  nil)

(defn template-fn
  "Example template-fn handler.
  Result is used as the EDN for the template."
  [edn _data]
  ;; must return the whole EDN hash map
  edn)
