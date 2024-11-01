Krijoni një program interaktiv që lejon përdoruesin të
shkruajë një fjali dhe më pas shfaq të gjitha fjalët
unike të përdorura në atë fjali.

Input: "Sot eshte nje dite e bukur dhe shume bukur";
Output: ["Sot", "eshte", "nje", "dite", "e", "bukur", 
            "dhe", "shume"]

Përditësoni programin nga detyra e parë që,
përveç fjalëve unike, të tregojë edhe sa herë
është përdorur secila fjalë në fjali.

I: "Sot eshte dite e bukur dhe shume e bukur"
O: {sot => 1, eshte => 1, dite => 1, 
    bukur => 2}

Krijoni një klasë MenaxhoStudentet me një metodë
shtoStudent që pranon emrin dhe mbiemrin e një
studenti dhe kthen një objekt Student të ri.
Çdo objekt Student duhet të ketë veçoritë emri,
mbiemri dhe id.
Identifikuesi (id) duhet të jetë një numër unik
me 5 shifra, i gjeneruar automatikisht ne menyrë
të rastësishme gjatë krijimit të studentit.
Pasi një ID t’i caktohet një studenti, ajo ID
nuk mund të përdoret për një student tjetër.
