package com.drandarov.hiragana;

/**
 * Comment out the syllables you don't want included!
 *
 * @author lisa-rosenberg
 * @since 23-09-2024
 */
class KatakanaDataSet {

    static final String[][] temp = new String[0][0];

     /////////////////
    //    Romaji    //
    /////////////////

    static final String[][] romajiData = new String[][] {
            {"a", "i", "u", "e", "o"},

            {"ka", "ki", "ku", "ke", "ko"},
            {"ga", "gi", "gu", "ge", "go"},

            {"sa", "shi", "su", "se", "so"},
            {"za", "ji", "zu", "ze", "zo"},

            {"ta", "chi", "tsu", "te", "to"},
            {"da", "ji", "zu", "de", "do"},

            {"na", "ni", "nu", "ne", "no"},

            {"ha", "hi", "fu", "he", "ho"},
            {"ba", "bi", "bu", "be", "bo"},
            {"pa", "pi", "pu", "pe", "po"},

            {"ma", "mi", "mu", "me", "mo"},

            {"ya",       "yu",       "yo"},

            {"ra", "ri", "ru", "re", "ro"},

            {"wa",                   "wo"},

            {"n"},
    };

    static final String[][] romajiExtraData = new String[][] {
            {"kya", "kyu",        "kyo"},
            {"gya", "gyu",        "gyo"},

            {"nya", "nyu",        "nyo"},

            {"hya", "hyu",        "hyo"},

            {"bya", "byu",        "byo"},
            {"pya", "pyu",        "pyo"},

            {"mya", "myu",        "myo"},

            {"rya", "ryu",        "ryo"},

            {"ja",  "ju",  "je",  "jo" },

            {"cha", "chu", "che", "cho"},

            {"sha", "shu", "she", "sho"},
    };


    //////////////
    // Katakana //
    //////////////

    static final String[][] katakanaData = new String[][] {
            {"ア", "イ", "ウ", "エ", "オ"},

            {"カ", "キ", "ク", "ケ", "コ"},
            {"ガ", "ギ", "グ", "ゲ", "ゴ"},

            {"サ", "シ", "ス", "セ", "ソ"},
            {"ザ", "ジ", "ズ", "ゼ", "ゾ"},

            {"タ", "チ", "ツ", "テ", "ト"},
            {"ダ", "ヂ", "ヅ", "デ", "ド"},

            {"ナ", "ニ", "ヌ", "ネ", "ノ"},

            {"ハ", "ヒ", "フ", "ヘ", "ホ"},
            {"バ", "ビ", "ブ", "ベ", "ボ"},
            {"パ", "ピ", "プ", "ペ", "ポ"},

            {"マ", "ミ", "ム", "メ", "モ"},

            {"ヤ",       "ユ",       "ヨ"},

            {"ラ", "リ", "ル", "レ", "ロ"},

            {"ワ",                   "ヲ"},

            {"ン"},
    };

    static final String[][] katakanaExtraData = new String[][] {
            {"キャ", "キュ", "キョ"},
            {"ギャ", "ギュ", "ギョ"},

            {"ニャ", "ニュ", "ニョ"},

            {"ヒャ", "ヒュ", "ヒョ"},

            {"ビャ", "ビュ", "ビョ"},
            {"ピャ", "ピュ", "ピョ"},

            {"ミャ", "ミュ", "ミョ"},

            {"リャ", "リュ", "リョ"},

            {"ジャ", "ジュ", "ジェ", "ジョ"},

            {"チャ", "チュ", "チェ", "チョ"},

            {"シャ", "シュ", "シェ", "ショ"},
    };

}
