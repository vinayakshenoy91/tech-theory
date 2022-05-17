const fs = require('fs');

let stores = [6471,
    6473,
    2551,
    3084,
    5939,
    2667,
    2425,
    2423,
    2422,
    2663,
    5379,
    5137,
    5930,
    5138,
    6109,
    2429,
    2549,
    5031,
    6002,
    3095,
    3406,
    6916,
    6919,
    2799,
    2557,
    2436,
    6918,
    2797,
    2676,
    2555,
    3401,
    2675,
    2310,
    6913,
    6915,
    6914,
    4858,
    5168,
    4630,
    2694,
    2693,
    2330,
    2450,
    2328,
    2326,
    2444,
    3411,
    2200,
    4505,
    4506,
    2329,
    6265,
    6264,
    6269,
    4882,
    5851,
    3310,
    3430,
    2461,
    2340,
    5290,
    5170,
    5171,
    5293,
    3426,
    2699,
    2335,
    3301,
    2574,
    6810,
    6017,
    5601,
    6814,
    4879,
    3429,
    5184,
    6273,
    5982,
    5740,
    3440,
    2230,
    6270,
    2470,
    2590,
    6271,
    3439,
    2900,
    2108,
    2228,
    3316,
    2105,
    2104,
    2587,
    2103,
    3433,
    2102,
    2222,
    2101,
    5852,
    5731,
    2907,
    5992,
    2122,
    2361,
    6161,
    5194,
    3324,
    2919,
    2917,
    5745,
    6053,
    6056,
    5760,
    5762,
    2375,
    2132,
    3220,
    2371,
    3219,
    2801,
    2800,
    2008,
    2920,
    2007,
    2248,
    2126,
    3213,
    2487,
    3212,
    2808,
    5998,
    4425,
    2804,
    2924,
    5652,
    3230,
    2141,
    2020,
    6181,
    3470,
    2933,
    2812,
    3108,
    2019,
    3228,
    2136,
    2015,
    3345,
    3344,
    2819,
    5769,
    5528,
    2814,
    2934,
    6197,
    2397,
    3243,
    2396,
    2275,
    2154,
    3120,
    2394,
    2031,
    6193,
    3240,
    2272,
    2030,
    2392,
    3480,
    2943,
    3239,
    3237,
    3115,
    2389,
    2388,
    2025,
    3234,
    2387,
    2266,
    6504,
    2949,
    6506,
    6505,
    2947,
    2825,
    6401,
    2166,
    3133,
    2286,
    2044,
    2164,
    2163,
    2042,
    3493,
    3372,
    2162,
    2041,
    3370,
    2160,
    3490,
    2280,
    2955,
    3009,
    3008,
    2952,
    2038,
    2279,
    3488,
    2156,
    6997,
    4579,
    2838,
    5307,
    2836,
    2835,
    5441,
    6653,
    3387,
    3145,
    2055,
    3142,
    2174,
    2294,
    2172,
    2171,
    3380,
    2962,
    2049,
    2840,
    3378,
    2168,
    2047,
    3377,
    6647,
    5438,
    2849,
    2969,
    2848,
    2846,
    4480,
    6781,
    5330,
    4483,
    4362,
    5331,
    6420,
    5332,
    5333,
    3398,
    2067,
    2187,
    2186,
    2065,
    2064,
    3031,
    2856,
    3149,
    3026,
    2971,
    2850,
    2179,
    5566,
    5567,
    5326,
    2737,
    6419,
    2736,
    6553,
    4375,
    6797,
    3288,
    3166,
    2195,
    3041,
    2073,
    3040,
    3281,
    2071,
    2744,
    3039,
    2742,
    3036,
    5456,
    5335,
    5336,
    5458,
    2748,
    2989,
    3290,
    2080,
    6440,
    5110,
    3178,
    2880,
    3297,
    3055,
    2087,
    2083,
    2636,
    2877,
    2876,
    2994,
    2992,
    2639,
    2638,
    3181,
    3060,
    5363,
    5124,
    5125,
    3188,
    2770,
    2098,
    3065,
    2096,
    3063,
    2647,
    2767,
    2886,
    2885,
    3179,
    2882,
    6329,
    2406,
    5131,
    3190,
    5132,
    5133,
    6467,
    6225,
    5135,
    5014,
    5378,
    3074,
    3193,
    4838,
    2898,
    2535,
    2654,
    2653,
    6457,
    5128,
    6459,
    2538, 3066, 2152];


let x = "StoreID,SlotGroups,StartDate,EndDate\n";
fs.appendFileSync('regenerate-slots.csv', x);
for (let i = 0; i < stores.length; i++) {
    x = stores[i] + ",8,30/03/2020,26/04/2020\n";
    fs.appendFileSync('regenerate-slots.csv', x);
}



