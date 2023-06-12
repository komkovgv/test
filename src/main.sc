require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: Акции и льготы

    state: Start
        q!: $regex</start>
        a: Здравствуйте! Чем могу помочь?

    state: Bye
        intent!: /пока
        a: Пока пока

