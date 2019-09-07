package com.example.imeeting.modules.homepage.model;

import java.util.List;

/**
 * description:
 * created by wangbin on 2019/6/5
 */
public class RecommendResponse {

    /**
     * meetings : [{"id":"10197","province":null,"city":"南京","area":null,"kind":"会议","title":"爱米厅共享空间-会议室A","content":"爱米厅共享会议空间是爱米厅公司自建的第一个实验性空间产品，空间定位商务会议需要，主要针对在新街口附近工作的商务人士，或对会议空间有临时需要的外勤人员，空间管理实现智能化，无人化。\r\n\r\n所有会议需要的硬件智能设备一应俱全，包括智能的多媒体屏幕（能够实现投影，白板，截屏，上网等功能）","mianji":"22m²","shop":"274","shopname":"爱米厅共享空间","create_time":"1536565205","update_time":"1559139153","hot":"9999","score":"5","tel":"17705151588","positionimage":"142915ba50e317c22a.png","youhuiquan":null,"openingdays":"周一,周二,周三,周四,周五,周六,周日","openingtime":"07:00-23:00","openingtimebegin":"07:00","openingtimeend":"23:00","address":"南京市汉中路27号新街口友谊广场26层c区","status":"1","number":"12","fitnumber":"12","slogan":"智能 高效 便捷 私密","oldprice":"150.00","price":"99.00","a":null,"d":null,"p":null,"s":null,"f":null,"sell":"38","type":null,"goodstype":null,"goodstypewords":"商务会议,商务培训,文化交流,活动聚会,拍摄录制,亲子活动,","user":"管理员","special":"1、空间2小时起订","special1":"2小时","special2":"可以","special3":"不可以","special4":"可以","special5":"","special6":"","rule1":"2小时","rule2":"10%","rule3":"收取定金80%","image1":"82035bab77eda2ad0.jpg","image2":"120085bab77eda2c41.jpg","image3":"227855bab77eda2e3c.jpg","image4":"255105bab77eda2f5a.jpg","image5":"127755bab77eda30a5.jpg","image6":"208845bab77eda31bf.jpg","image7":"","image8":null,"image9":null,"image10":null,"image11":null,"image12":null,"image13":null,"image14":null,"image15":null,"image16":null,"image17":null,"image18":null,"image19":null,"image20":null,"click":"7370","oncount":"152","person":"1","openid":"o75mP4mU_oLHJRS1J_lykQI3Xk6g,o75mP4lerOlujHOzJV6WHgkx0NEY,o75mP4mv_8pbddIc0utXIUGuR_sQ,o75mP4t8Ux-mRZwSyfDXHvfg5VUo,o75mP4oE1mpktZVrEKN5jqgxP4Vs,null,o75mP4hQVV9WJV3RTFlct5Xw_vzU,o75mP4u8OAZ4c4h8nvyEncTK3wL0,o75mP4iLJPmEosUjdBi6c0xLMpdg,o75mP4lPsDpKRn3kFKztRCJmOuTQ,o75mP4iTyr5HoXYOtkHYFLkm6wW0,undefined,o75mP4otXs3_Sp215_bCuHuG0A0o,o75mP4qzsvzQ8GSv4NypuKHcIoHc,o75mP4lpXCjc0qhOVMdp5HCNiWc4,o75mP4mQrj-OoupSWz85nnXgWm4s,oUZP64uJEU_BXkrSfMSZmsTV5hJQ,o75mP4q3e9ThsoyIqv4PGTwzy_nk,o75mP4gx1LSK-MCOV-_d6OnnFC84,oUZP64kmmUmuYR_GMROdXHdMSWZ4,o75mP4rhV0QVHPeMD2bWFLNM0hRI,o75mP4ludRpTwgluErglu2gaaVrw,o75mP4tZRSIk6SsbdD0-LTACMAD0,o75mP4iiF6UxafhcMJ3ubEU0yNFU,o75mP4uwqTo6Gnz0BoVkKpI10BYM,o75mP4kKasvKivmlIb73ifnXPNFI,o75mP4jlIuEXojPfZRMpZcrIuSPk,o75mP4mMj1iRmiu6u-bP6S3A2mYM,oUZP64vtvVTAAql8mJs75uLGR6JE,o75mP4qVImWdEQL8DOzQXtrF-T6w,o75mP4jX_SQmhw-oF1oiCN9YwOvc,o75mP4pPbB9FOj1Q2djwn-WfJCIc,o75mP4iQ308Cph2tunISjBPEJrnM,o75mP4qGovXbHODcWbMwlTLsKXxg,o75mP4iZPGTWPTNJNa1kPk7cvxZM,o75mP4sCUsWUM7EqKynkaq_maaR4,o75mP4n_Ybtj5EilEzzPnkf_pgFk,o75mP4rjHZJMr08ptyGHHjNNBWJw,o75mP4tiNUzoSmWp6yzuCouhy_I4,o75mP4vxHfn7KhFXaValjqYdB3GQ,o75mP4iQXa67Y4WAQnzyQ6ztsBjM,o75mP4mIwpispcdeLC_ChIL-VXB4,o75mP4p6mzx9gyTBCQVEMhx2l808,o75mP4rSwDzu8ArjdtM_hLqHKHXk,o75mP4rrnk6P3VwLKqk_CE-1oJKE,o75mP4hgFCumnF_OCnxUNX1B1aS8,o75mP4hUfb8HanIlJzEwhFNnohZ8,o75mP4iDqQGyGxmy9xPUDQG4VXu0,o75mP4irtUmrnCCyFCnt_RlrCMsM,o75mP4qxxo9ItRsRq7mwOVX4xGS4,o75mP4g_avnBfmPHZFfvpbm4EaHQ,o75mP4hqwpAH0J6uFWowgRvzuhlc,o75mP4rrm_QLR81Shi3Ta6u8JQdw,o75mP4ng8GE8A0V33RP2KLtVdS_0,o75mP4rNerRlmSPhE9Riqy0zMal8,o75mP4vwXu1tdYmn7Zvyn4FNTLy0,o75mP4jdD1pYQ_vrizN9BaohH3GE,o75mP4sHN8Vf63Y6c4wxPPN5dLi8,o75mP4qACH51gjV3KRcXG7O-XYEQ,o75mP4jDiNuR_DkLbswMnexynvyQ,o75mP4tXjRp4rXu1mo0-OaspTYGE,o75mP4tLxiBdYkCSJ5Bc11MqBMzQ,o75mP4mBOzYG36GHXLizOVXrs_KQ,o75mP4ogqoPb342HvOWkqa1oG430,o75mP4oDkpt4WK3cz-w-zVbaLjpQ,o75mP4vy-V4gMDM7lGJ1LG4krOXM,o75mP4tS3DSL40k2azj1rL2LtKog,o75mP4sw1lseQE1QbLmo9w1QdrCg,o75mP4n6pYJnMfHH1oZLABJTGPkU,o75mP4lm5_KcgTsDgemxD99MZkJU,o75mP4i_Jw77mYu6TLrck5Vlyu3c,o75mP4vDmHl_uqgDNm0GEbuUl4yU,o75mP4ti4hUPzIT2l3nuWE5GCRTw,o75mP4qbwg-f7eFqnXcHQqIluYBY,o75mP4rTx_0qs0VddeMy1rdPNgZQ,o75mP4qsFcYRCvlFGqEeLzjDKTRw,o75mP4oWE46DkJGjyFifCHTau8XI,o75mP4pgmaoNwrFdlusCopUQ5Plg,o75mP4iW9b5h2tFPj3EV9QHqJdjA,o75mP4r1DO1Zs-xJ2El6EnATk2zU,o75mP4rqgpiDo38j3DAOXFBAR6MQ,o75mP4pcZFWImHVbxkY7-_MgB2Z0,o75mP4kUSLOLBlkca1qioI5sA4Ak,o75mP4gh9PQVggRq0nmYUkE39S4I,o75mP4mpbBCxryTs5L6CJSlscTx4,o75mP4rmLbfJu3AirLOyDutNKnLQ,o75mP4u60MFvqXPwkV8E7ZxBk90I,o75mP4gtLanRjIVji2o55mzNurGA,o75mP4u_QBMwvj-WKdzdz-9RDUpU,o75mP4lN6R-Nuq2Qc7q3TiHLulUU,o75mP4tF7Niy8solzv9QKdf6_ok4,o75mP4oS21avIuorAacR86qGcjk0,o75mP4mK0jX_6jJbkxb8NshopTPw,o75mP4lA8F3u3SHLI1_wtWAe4npQ,o75mP4pEYL7ErKKOfdSAeymNW-Hg,o75mP4oBxSKj3xI7Y3YhnMzeEdMI,o75mP4lAEsLjKvWe7Xg-nAEvhtkE,oUZP64jA28lzVkGpO8Dk3RGk1Sis,o75mP4ipoCIGZx39267rNs5vwNHU,o75mP4u3xzyMYjHvdDkOWoyWEOLc,o75mP4msZUq2JH4O7OC0UviAfw40,o75mP4iGgubSMH5SGXoTlDld0Yws,o75mP4iNV1fPq9oYmQInJb7pqc7I,o75mP4lt-qO6ho4gLPFOnrmwrQK4,o75mP4ujlfa9_dEA9vsMcSrwJHL4,o75mP4jyLvLnlK4V1tTle5c-XBZQ,o75mP4pb3PDGhOte0oGUSrg-MwdQ,o75mP4pgEWpxhENUfTGDpmB_CywA,o75mP4pB0Pg08Qm49tw_Bxv21SlM,o75mP4jBKnH0IZwSa_bTsqP9SHmg,o75mP4gytoFLx2SVyOYBC2q5b3Eo,o75mP4vKEGIhUAaXOjt2shSXJcDA,o75mP4gDX6NylUHlEk2ADhohda30,o75mP4gJuDXrMo-uSHL9fFqSmjHs,o75mP4p7Zu-sL3gNJyGA5clF6zFY,o75mP4lG_ZL3hLXOYbUWDn2KS0gA,o75mP4huAI3d-ppiFtXehaxRCxy4,o75mP4ooRFBeUoZRkTj0__g-Qy8M,o75mP4rFWDDTxASI0y2Yux-TigIE,o75mP4gY5hNCztAHHi4dqNxsJnhU,o75mP4tIb5xl_5cRPklK6kEnweF0,o75mP4qoO92I4EdPn9m-Z2zDzJRw,o75mP4hoTS6amBM3Eki-a8Irvwy8,o75mP4nnrFrlT9mvpF6496K9_jFE,o75mP4tuPhqu7XoF3lssLtyMzDZ4,o75mP4hicarL895Op3luBXofPrkg,o75mP4ji4or-Hh22Lomvv963GORw,o75mP4k8VwCKN2O_-_bdh-LDf_eo,o75mP4vGey_LGU3kefqgBJ42Yki8,o75mP4pOmEjdLF5fiviRqop2BH-M,o75mP4sgL8x07A6IwGJYkkq5zugE,o75mP4izt1GVZJvJ5Zk21hUgQEH4,o75mP4qEcZZypmJed4x1L68oGHkg,o75mP4nTrrHcHgBE_Mp6Ph80gEzM,o75mP4qDxHTr-WcMIDZUCZiKnP-I,o75mP4l7apfVSQSXGPc0Id6tuzCs,o75mP4ofTAieICeXtz8a3kHWZaBc,o75mP4juz4yFuBD0Y0OjZjq-DTd0,o75mP4ksZEGtUHHxvhpFOTi_TwrE,o75mP4i0aylgPuD62c0LsgwUUj3M,o75mP4jv6Xas9jIMzGhYgh1JSmUI,o75mP4vjSQv3goGlXa8LXDUE-h2k,o75mP4nEu4EKXvnJ1mx5_jsUqHqk,o75mP4qjM5DH9oAmuNN6F4jsG8eg,o75mP4qJS9YJrTFdPm2x6AELkAeU,o75mP4r0YcOxBjDRlYyXVvhkabMk,o75mP4l3IsNplOV_-1x4rvx15osE,o75mP4iyn7ILtPA2QkIv7OAMmYzU,o75mP4hseeUEu8w1euwJ9rudpLzI,o75mP4i1dFE8x4yVjAEruKugJdHI,o75mP4vc9w3dWAvIrqBfKIVCi-JI,o75mP4jF5uKyVq9x3FZrrHT4mNhM,o75mP4gHWHTG3V6jKWbf4VgnysNY,o75mP4rYFC_I_OtqPS4zvrPySiX4,o75mP4tHM1Wzx_iEzXy9BX2fDTTU,o75mP4vZ4L1AtYTRHMrwt7sKvkYI,o75mP4sgnmPqSuxzNlODh93bZoTY,o75mP4pSTCv4d1s1uAfkWXJw8XGc,o75mP4uhwbyjzJre0eyI3Vm2MoRE,o75mP4s0306KPyB9tnYs9AhNqBKo,o75mP4pMR7MTwktPgg-qBIOYB4lg,o75mP4ki0NIgEHuGYn75lx5pEhHM,o75mP4uBV9-Wd3rgta-KMOjvmtNM,o75mP4gKGrwvsvrl01p3DvrKke7E,o75mP4k2OLW6TQpnaKly-B1KQvpo,o75mP4iL1KY1F0X98LHXqhz67SJA,o75mP4mcK3XPZSvavVzk2jcoDXKA,o75mP4rc0NrGYOrfHx4RHD0SUp4o,o75mP4ul7DEiCBM6tLmn7FQ-evKs,o75mP4vlpgZ-5wovn4qZ28eObsw8,o75mP4v_RReu5Un0eMsuZ4rlD_HM,o75mP4rR1ZNTFjSlPMN5BdInTj5c,o75mP4t0USrJin9kG9qSiPzKra9M,o75mP4spGb_O99tPzjFP_ctF_UVM,o75mP4ssCWsW7fpnnVAy2NPW7cLI,o75mP4vFnvKHHgZbPCU-_m84zfWU,o75mP4mi5buFepKPiApoy2QOOPe4,o75mP4vamcX-RpjqsrONit7-sj3M,o75mP4q3MpJGnaOFEMtc6mXJ4clU,o75mP4gmQt0Xtw-rGp-YXzCMk-UM,o75mP4lxQlTTDWqq4cc2z5UybL2U,o75mP4vsnR7J-nLwxu4XUYfCYKe4,o75mP4mRau4i4K3EQa5jJQ5HExcw,o75mP4mXb99zYvh6jhkeGJ4xrO-o,o75mP4sbUxUEF8x13n2x0UlGbdws,o75mP4tDAhwLwH_tYrHVyJZp4XPI,o75mP4hyoA2Jull42xBtL4AsAV5E,o75mP4puJ-WqX5cR2X_mgUQgYkng,o75mP4oOAd5aukKQbRRH-3P2IANE,o75mP4gKhw1FCxFn5ZZ2jfMWXFsk,o75mP4gQQqwHp99xWxYvH_DwujXI,o75mP4klLpgapABQ7u6KYy0ceRgM,o75mP4ou7XfSmG-DOKJAEwjGJt68,o75mP4kq5aFF1ySSvOBitukkVZgU,o75mP4luqobDgF8KYf2HQAXfSMY4,o75mP4tqbbzDXaSpnJgHyXpV3SRc,o75mP4hBjmW1R0yRkg1tUGsPBYQ4,oUZP64gFahwEkWdh5Jijw2qeNysc,o75mP4oEJBvJtZpnlm2yjbNg1RYE,o75mP4h4EvJsIf-9B1p4csLDu0rs,o75mP4j0guSw4_t5gK5AVwYwy-CA,o75mP4pm6X3W-yjpOcKzj6NLI5CU,o75mP4jj0qc9hZ-lAkY4jKiLC628,o75mP4q7-Sy61vLnVpOi4dyNXo0M,o75mP4tQB5lE_jBGD6NISujDpsLg,o75mP4iJEB9Z_ggOJaPxxhUH2TTg,o75mP4u07K6yuGfdtRA_cw0tVOqU,o75mP4m_mhX6QRuOCjudfyfOcwGw,o75mP4sfz2gEFIwvEm-ncZKc6D7Q,o75mP4vqZkJoN1gw1vmru6ZUvN7w,o75mP4u68hngU2E8-D55QVd2Sydc,o75mP4jrtbRtz2u6WrvmTv8PNUHs,o75mP4n-9C2ISWYxP5UFPAmuVaSw,o75mP4vh63zCMK29hBMz1uj8IplU,o75mP4qFLVn-EVu7QlonA_92uBmU,o75mP4py1ZI_e3DOjG0nYJ89siUs,o75mP4s_cmtXKRe9St2AK_pbCtnM,o75mP4sC75DaywYpFaSEY6VTDP24,o75mP4r0383wuzZ2i9qKKUXg94jA,o75mP4gk-PFTDO-2px-IFpD6u4W0,o75mP4oifZAWbFJuKMK8d1muo0fA,o75mP4u_pBxPks1j_P7ykfsnHIRs,o75mP4sRSJ-CxadTiKieRlbIIZnc,o75mP4jBLQxA0QgyIeMMumgO2W4c,o75mP4ia4WlQ-7ZrvXpGVCXm50vk,o75mP4h3wDLNrhygaC4RFiHtCJ9U,o75mP4nrFRJR0QLNFheuOTB6rJz4,o75mP4vDXm8JlBhkA3rIKGgjRu3E,o75mP4m_s1MhITaRjX73-DsIQt_c,o75mP4kU0R4AdsaNNqg2vwlmk8WI,o75mP4nQ_dpkKx-3L7pYqlHT-Z1s,o75mP4gRrc2AcJeVeG0yUT39d7qU,o75mP4hkrm2JvaqSCCwgy8zIiQ3c,o75mP4uNG1z9jh2oY4teoe6kXcnE,o75mP4rRM-iok2ioJaZCmWTxO7yI,o75mP4toeNUSPJdTVPiImqxGBWCE,o75mP4lCXS_RVEdrc5vuDDLZxD5k,o75mP4o1O31gAe4DN63zd-BgYL3Q,o75mP4iMvT39-RFKLYrlhH_eO7V8,o75mP4hmZ7fxYYH97TC58RrEyV9k,o75mP4tYPw3_I2_hZ1UTf9YHMc80,o75mP4mIH-zg4C44GGojZ_zNb5hY,o75mP4nTVoY47oQdregYkM7L9SsQ,o75mP4sR3d4_mbPFb3kkX0Xo7s_k,o75mP4knDFZftiSJB6b6uZKMKlBk,o75mP4vWiqycHhuCI9nKmhTLhxFM,o75mP4jbpeXprT3GsM8tBe-zB3Ws,o75mP4pKsW86a8wjumSVySQ59LF8,o75mP4ltP87mWL6WwmFyutz6RNqM,o75mP4nUQcdu71eUEiQo_OIBK2VU,o75mP4jphQpvHP5bc3juKAgBN650,o75mP4t50UPqXdT1V7s3YPThmI8I,o75mP4tTQun5HFh0LqpDCPjcLQJU,o75mP4uv1Fp5sPfnlW4-qY2OyeZA,o75mP4tQagCP8yAtfZWnfVE7IgII,o75mP4roS2ibY4M8Ao5LBykotlDs,o75mP4gxmaGa9uvVL_q9EtH5UKbQ,o75mP4mSbGZkBY-9pkW-kuuya_lA,o75mP4oJH05GKqmLrC-YN0t6aMzE,o75mP4rnVZl1ju3pLDBFTtSstaHM,o75mP4rOqFKico2jIT_fpYYjw_Xs,o75mP4qh19tgsY4y6l5szvOmpuvk,o75mP4sQiG_pdOBDj8Dg6vRLdsno,o75mP4iHX5spvdYb-s__Kj6B5qTE,o75mP4uPUf3gqdI8pKCe8zkHez8M,o75mP4mJEqyzGwhFv4HlWILkHkz0,o75mP4laI7uS1Q2wbPNFRGx4Xz5c,o75mP4vLSIKTT8b1jqC6CXpKwvOk,o75mP4hAgbYTBmM8SHStB0ePAdcQ,o75mP4lpguBrL-ZqoTu1uXxvUltk,o75mP4mZha3WC8xYmQl7O9G9iGC4,o75mP4rj6Og2ry8qLlPbsro8wt9U,o75mP4hNSfuVBOKhrN8aog9ZKBaw,o75mP4gVuT0zAirhjC-dEmR9548M,o75mP4neviRRIimGFG5jfnohDnl8,o75mP4mvj1DOfxqKfNcEiCC5d24Y,o75mP4r-rq5xBkU_IAIT69j4cNzs,o75mP4uDrsC2VE70ed4T3y9u4qKY,o75mP4pAfApJomXeydxiPSOzdqiA,o75mP4hVFYCEvSeSEM08G_xrLqWs,o75mP4lSy0N4UqqwjMlUVX259h34,o75mP4uJPL9yJj6TrFTnEZRxwR2A,o75mP4lgLoEurvfRW9rZ9mboXZ94,o75mP4g7DFupCIrcx1h78IQT66Z0,o75mP4mYp5iI-8zCqpooV6lDZVho,o75mP4lN5d1vTOs7zQvglXpu4Enw,o75mP4pSUWDTqMoyumKA6PEqxx1o,o75mP4hM6SXKLCd81RpvTAIujeLM,o75mP4gozFZ9FF8-2AqsELruU43k,o75mP4sPjxIjXW8S9ehLUOSOpCdM,o75mP4qAKJlaTD6OIVO9tpHAmESk,o75mP4rBokVvqwZ4nxa27LSpIijM,o75mP4ggXnqApbfYuh2128rBL12w,o75mP4oSai8k-ILJx24tVPQY4IwA,o75mP4thPLcJdx0InE43ZnXBkDG4,o75mP4hcHJRcKVahGu7zqpMlq2NQ,o75mP4rbPVyAyYrHk2iX8ggI40H4,","recommend":"严选,特惠,热门","yajin":null,"homerecommend":"首页推荐","bq1":null,"bq2":null,"bq3":null,"bq4":null,"bq5":null,"bq6":null,"press":null,"ystatus":"0","youji":null,"author":null,"weizhi":null,"source":"1","tags":"WIFI,白板,茶歇,打印,纸笔,发票,投影仪,激光笔,转换器,多媒体屏,蓝牙音箱,电源插座,智能翻译,","content2":null,"remark":"","lat":"32.047912","lng":"118.788211","jw":"118.788211,32.047912","xingzhengqu":"秦淮区,","shangyequ":"新街口,","ditiexian":"1号线-新街口,2号线-新街口,","useoldposition":"10200","samepositioncount":"2","image":"https://imeeting.jiuze9.com/imeeting_new/Public/Uploads/82035bab77eda2ad0.jpg"},{"id":"11145","province":null,"city":"南京","area":null,"kind":"咖啡","title":"品秀臻选咖啡-芥子园","content":"芥子园是明末清初文学家、戏剧家、美学家、出版家、园林艺术家李渔的家宅式园林，也是中国传统绘画的经典范本《芥子园画谱》的诞生地。芥子园的主人李渔（1611－1680），初名仙侣，后改名渔，字谪凡，号笠翁，浙江金华府兰溪人，被后世誉为\u201c中国戏剧理论始祖\u201d、\u201c世界喜剧大师\u201d、\u201c东方莎士比亚\u201d，是休闲文化的倡导者、文化产业的先行者，并被列入世界文化名人之一。大约1662年前后，李渔来到文人荟萃、虎踞龙盘的六朝古都南京，先居住于金陵闸附近，后来在孝侯（指晋人周处）台边购得一屋，因\u201c地止一丘\u201d，故取名为芥子园，取\u201c芥子虽小，能纳须弥\u201d之意。历史沧桑巨变，当年的芥子园已不复存在，但是其在中国园林史上的重要地位却没有动摇，李渔在南京的文化活动也与南京这座历史名城紧密联系在一起。2016年，芥子园得以重建，一草一木、一砖一瓦颇为考究，尽量依据文字记载，更好地复原了当年芥子园的风貌，复建后的芥子园规模基本符合李渔\u201c芥子园之地不及三亩\u201d之说。NESPRESSO这位来自瑞士的绅士，这一次，把咖啡馆开到了南京老城南的小园子里，在水榭亭台喝咖啡是一种怎样的体验？NESPRESSO携手颐和·芥子园为您呈现。走进颐和·芥子园，推开花格木门中式深掩的会客厅小巧精致，春日下午茶套餐浪漫慵懒，正适合这个芳菲的季节。我们想与您共赴一场园林间的沙龙，共同做一杯属于自己的特调咖啡，探寻全世界咖啡的极致秘密，也想与您在竹林溪涧，聊聊城南往事。","mianji":"100m²","shop":"569","shopname":"品秀臻选咖啡","create_time":"1554388183","update_time":"1555773842","hot":"9991","score":"5","tel":"15895954264","positionimage":"204815cb09c3fefb52.png","youhuiquan":null,"openingdays":"周一,周二,周三,周四,周五,周六,周日","openingtime":"10:00-19:00","openingtimebegin":"10:00","openingtimeend":"19:00","address":"南京市秦淮区老门东陶家巷8号","status":"1","number":"30","fitnumber":null,"slogan":"安静 园林 往事","oldprice":"599.00","price":"299.00","a":null,"d":null,"p":null,"s":null,"f":null,"sell":"0","type":null,"goodstype":null,"goodstypewords":"文化交流,活动聚会,拍摄录制,亲子活动,","user":"管理员","special":null,"special1":"4小时","special2":"不可以","special3":"不可以","special4":"可以","special5":"为了更好的为您服务，我们建议您提前24小时预订","special6":"空间可提供简餐及下午茶服务，如需要可提前致电空间准备，空间有户外休闲区域，可灵活使用","rule1":"12小时","rule2":"20%","rule3":null,"image1":"65315cb0926765f69.jpg","image2":"304645cb09267660df.jpg","image3":"233535cb092676623d.jpg","image4":"259825cb0926766387.jpg","image5":"191675cb09267664b5.jpg","image6":"8125cb0926766600.jpg","image7":"291735cb092676672b.jpg","image8":"234345cb0926766864.jpg","image9":"138195cb09267669bb.jpg","image10":"97525cb0926766b0c.jpg","image11":"144495cb0926766c32.jpg","image12":null,"image13":null,"image14":null,"image15":null,"image16":null,"image17":null,"image18":null,"image19":null,"image20":null,"click":"170","oncount":"12","person":"1","openid":"o75mP4ksZEGtUHHxvhpFOTi_TwrE,o75mP4mU_oLHJRS1J_lykQI3Xk6g,o75mP4n-9C2ISWYxP5UFPAmuVaSw,null,o75mP4oKkJtwhxJIB22U3XSyKhrY,o75mP4pxE-Nffvmn2uCJwAXhdIcI,o75mP4iXsRIZkiio-ZHKgKLkstS0,o75mP4mBVY_MxZnhprV9B-3Ka4Uo,o75mP4j9B2sWPSGch4eKi0Ayq0B4,o75mP4pJiH8JnlPg4xYhp23TpHro,o75mP4lxQlTTDWqq4cc2z5UybL2U,o75mP4mv_8pbddIc0utXIUGuR_sQ,o75mP4t8Ux-mRZwSyfDXHvfg5VUo,o75mP4py1ZI_e3DOjG0nYJ89siUs,o75mP4oV0eSL9xTc0g5aRdQK_TY8,o75mP4pKsW86a8wjumSVySQ59LF8,o75mP4jHgETYAPYMF1qu_HikxVNM,o75mP4tQagCP8yAtfZWnfVE7IgII,o75mP4nUQcdu71eUEiQo_OIBK2VU,o75mP4gQQqwHp99xWxYvH_DwujXI,o75mP4pNLe2HlesAP7E1_zjc0fAI,o75mP4jrx1WtaSb8vKL22wTNEqyw,o75mP4jWdQuAxwkLkAFMlLWTglZY,o75mP4oXFQKhwchuWyFTM0T1IPvQ,o75mP4sbUxUEF8x13n2x0UlGbdws,o75mP4mHnutfe73hfyjyn0Ew42Vs,o75mP4mSbGZkBY-9pkW-kuuya_lA,o75mP4nTSt08t90B9OYXUre4gP14,o75mP4rnDDrm0O8-STKgUNKthmZI,o75mP4gru__C8kqZr3Kx769Stdb4,o75mP4hqwpAH0J6uFWowgRvzuhlc,o75mP4rnVZl1ju3pLDBFTtSstaHM,o75mP4oFQIdiiw9HGVB4nWpeRUg4,o75mP4hQDu2t7-taQ7sls4jZYXHU,o75mP4vqZkJoN1gw1vmru6ZUvN7w,o75mP4qh19tgsY4y6l5szvOmpuvk,o75mP4sQiG_pdOBDj8Dg6vRLdsno,o75mP4iHX5spvdYb-s__Kj6B5qTE,o75mP4rRoqWhMDi5aud77qekufAs,o75mP4lpguBrL-ZqoTu1uXxvUltk,o75mP4vZ4L1AtYTRHMrwt7sKvkYI,o75mP4mZha3WC8xYmQl7O9G9iGC4,o75mP4thPLcJdx0InE43ZnXBkDG4,o75mP4r-rq5xBkU_IAIT69j4cNzs,o75mP4uDrsC2VE70ed4T3y9u4qKY,o75mP4lgLoEurvfRW9rZ9mboXZ94,o75mP4gmu5gW7YoK_Ad32DRQJdNY,o75mP4rOrnKES_Bj7XVFX62TA9Qo,o75mP4lRJ32qebyGWbz2VX-hYffg,o75mP4izuFt2h6gn4TuH4ip9kU0Q,o75mP4qAKJlaTD6OIVO9tpHAmESk,o75mP4rBokVvqwZ4nxa27LSpIijM,o75mP4v5dm0ZZpeagpeUXwARBUW8,o75mP4h8Fx_j1XtUCL2GUYI_bVx0,o75mP4m2kdnfxmdTKUJuZUire5k8,o75mP4guumup9rVe27VltE2p3zds,o75mP4qpXzeTKHyvD0VWX720Q11g,","recommend":"严选,特惠","yajin":null,"homerecommend":"首页推荐","bq1":null,"bq2":null,"bq3":null,"bq4":null,"bq5":null,"bq6":null,"press":null,"ystatus":"0","youji":null,"author":null,"weizhi":null,"source":"1","tags":"WIFI,幕布,发票,投影仪,电源插座,","content2":null,"remark":"","lat":"32.018228","lng":"118.79515","jw":"118.79515,32.018228","xingzhengqu":"秦淮区,","shangyequ":"老门东,","ditiexian":"3号线-武定门,","useoldposition":"11144","samepositioncount":"4","image":"https://imeeting.jiuze9.com/imeeting_new/Public/Uploads/65315cb0926765f69.jpg"},{"id":"11209","province":null,"city":"南京","area":null,"kind":"文创","title":"灵谷山房-禅房","content":"钟灵毓秀紫金山里，郁郁葱葱梧桐树下，树影斑驳中有鸟语花香，几间全落地玻璃茶寮、一间古朴禅意的素面店，这便是灵谷山房了。以天地山林为室、品茶赏花，在大自然的怀抱里呼吸新鲜空气，放松放慢自己，回归慢生活文化 山房主人夫妇放弃自己的事业，走入山林，向大自然学习，按照自己的美学和人文理念，建设人文美学空间，也重启自己的生活方式。静心清心，抛开杂念，就从这一碗面、一壶茶、一枝花开始。无浮无躁，有情有致，有约未约皆可至。 你可以在这里喝茶，更可以在这里修习茶道、花道、香道、书道、绘画、女红、茶点等传统文化技艺，参加文化沙龙活动。","mianji":"100m²","shop":"590","shopname":"灵谷山房","create_time":"1557849125","update_time":"1558779882","hot":"9999","score":"5","tel":"13305171001","positionimage":"216475cdae10ea4e39.png","youhuiquan":null,"openingdays":"周一,周二,周三,周四,周五,周六,周日","openingtime":"09:00-18:00","openingtimebegin":"09:00","openingtimeend":"18:00","address":"南京市玄武区灵谷东路2号灵谷寺公园内","status":"1","number":"50","fitnumber":null,"slogan":"素斋 茶道 自然","oldprice":"0.00","price":"250.00","a":null,"d":null,"p":null,"s":null,"f":null,"sell":"0","type":null,"goodstype":null,"goodstypewords":"商务会议,商务培训,文化交流,活动聚会,拍摄录制,展览展示,","user":"管理员","special":null,"special1":"4小时","special2":"不可以","special3":"不可以","special4":"可以","special5":"为了更好的为您服务，我们建议您提前24小时预订","special6":"空间费用不含灵谷公园门票，抵达公园门口可致电空间主人代订团体票（20元/位）。空间可提供素斋服务（100元/位），如需要可提前致电空间准备","rule1":"12小时","rule2":"20%","rule3":null,"image1":"155005cdae57ae3c80.jpg","image2":"149995ce917ea620bb.jpg","image3":"93485ce917ea62243.jpg","image4":"298055ce917ea623a7.jpg","image5":"308825ce917ea624f8.jpg","image6":"269315ce917ea62655.jpg","image7":"12645ce917ea627a1.jpg","image8":"272415ce917ea62902.jpg","image9":"319825ce917ea62a59.jpg","image10":"280135cdae4bc69d4b.jpg","image11":"91945cdae57ae4033.jpg","image12":"26115cdae4bc6a039.jpg","image13":"45925cdae4bc6a196.jpg","image14":"295455cdae4bc6a2ea.jpg","image15":"209745cdae4bc6a442.jpg","image16":"57755cdae4bc6a59f.jpg","image17":"238365cdae4bc6a6f4.jpg","image18":"238455cdae4bc6a86f.jpg","image19":"79305cdae4bc6a9c6.jpg","image20":"32435cdae4bc6ab26.jpg","click":"85","oncount":"4","person":"1","openid":"o75mP4mU_oLHJRS1J_lykQI3Xk6g,o75mP4laI7uS1Q2wbPNFRGx4Xz5c,null,o75mP4t8Ux-mRZwSyfDXHvfg5VUo,o75mP4qW8GNqtMk7bMQCmKpa1_SM,o75mP4mv_8pbddIc0utXIUGuR_sQ,o75mP4oE1mpktZVrEKN5jqgxP4Vs,o75mP4tr7cnSAYP2js7KTH-P_0VI,o75mP4gVuT0zAirhjC-dEmR9548M,o75mP4mQrj-OoupSWz85nnXgWm4s,o75mP4mZha3WC8xYmQl7O9G9iGC4,o75mP4lxQlTTDWqq4cc2z5UybL2U,o75mP4uDrsC2VE70ed4T3y9u4qKY,o75mP4hVFYCEvSeSEM08G_xrLqWs,o75mP4u5im4eF7jYAaYDJUYOdCls,o75mP4nTVoY47oQdregYkM7L9SsQ,o75mP4rCWfdzkIyUMncs4dR-IeII,o75mP4lSy0N4UqqwjMlUVX259h34,o75mP4uJPL9yJj6TrFTnEZRxwR2A,o75mP4jHgETYAPYMF1qu_HikxVNM,o75mP4mYp5iI-8zCqpooV6lDZVho,o75mP4u8OAZ4c4h8nvyEncTK3wL0,o75mP4rBokVvqwZ4nxa27LSpIijM,o75mP4v5dm0ZZpeagpeUXwARBUW8,o75mP4hBjmW1R0yRkg1tUGsPBYQ4,o75mP4gxmaGa9uvVL_q9EtH5UKbQ,o75mP4guumup9rVe27VltE2p3zds,o75mP4lXrEhTmYlGyPgT2HUfmpI4,o75mP4qpXzeTKHyvD0VWX720Q11g,","recommend":"严选,热门","yajin":null,"homerecommend":"首页推荐","bq1":null,"bq2":null,"bq3":null,"bq4":null,"bq5":null,"bq6":null,"press":null,"ystatus":"0","youji":null,"author":null,"weizhi":null,"source":"1","tags":"WIFI,幕布,白板,茶歇,发票,投影仪,激光笔,转换器,音响话筒,蓝牙音箱,电源插座,","content2":null,"remark":"","lat":"32.061519","lng":"118.874268","jw":"118.874268,32.061519","xingzhengqu":"玄武区,","shangyequ":"中山陵,","ditiexian":"2号线-钟灵街,","useoldposition":"11208","samepositioncount":"2","image":"https://imeeting.jiuze9.com/imeeting_new/Public/Uploads/155005cdae57ae3c80.jpg"},{"id":"11219","province":null,"city":"南京","area":null,"kind":"文创","title":"紫金山探险公园-林上咖啡吧","content":"","mianji":"250m²","shop":"596","shopname":"紫金山探险公园","create_time":"1558707844","update_time":"1559378500","hot":"9997","score":"5","tel":"13512519730","positionimage":"47635ce7fe84d46e5.png","youhuiquan":null,"openingdays":"周一,周二,周三,周四,周五,周六,周日","openingtime":"09:00-18:00","openingtimebegin":"09:00","openingtimeend":"18:00","address":"南京市玄武区四方城2号钟山风景区水榭路","status":"1","number":"150","fitnumber":null,"slogan":"自然 探险 免费停车","oldprice":"0.00","price":"500.00","a":null,"d":null,"p":null,"s":null,"f":null,"sell":"0","type":null,"goodstype":null,"goodstypewords":"商务会议,商务培训,文化交流,活动聚会,拍摄录制,路演发布,展览展示,亲子活动,","user":"管理员","special":null,"special1":"2小时","special2":"不可以","special3":"不可以","special4":"可以","special5":"为了更好的为您服务，我们建议您提前48 小时预订。空间可提供简餐服务，如需要可提前致电空间准备。","special6":"周六、周日空间预订上调50%，增加250元/小时，线下支付给空间","rule1":"24小时","rule2":"30%","rule3":null,"image1":"223435cf239849533f.jpg","image2":"316045cf23984954c2.jpg","image3":"171385cf2062b15af2.jpg","image4":"279715cf2062b15c31.jpg","image5":"81285cf2062b15d68.jpg","image6":"135615cf2062b15ea8.jpg","image7":"63015cf2398495675.jpg","image8":"68155cf2062b16112.jpg","image9":"307005cf2062b16253.jpg","image10":"101655cf2062b16381.jpg","image11":"159465cf2062b164b2.jpg","image12":"168275cf2062b165f5.jpg","image13":"99445cf2062b1671e.jpg","image14":"26095cf2062b16843.jpg","image15":"299745cf2062b1697d.jpg","image16":"160235cf2062b16aac.jpg","image17":"226605cf2062b16bce.jpg","image18":"62535cf2062b16d0f.jpg","image19":"101735cf23a4475e4a.jpg","image20":"127225cf23a4476007.png","click":"27","oncount":"5","person":"1","openid":"o75mP4mU_oLHJRS1J_lykQI3Xk6g,null,o75mP4uDrsC2VE70ed4T3y9u4qKY,o75mP4lN6R-Nuq2Qc7q3TiHLulUU,o75mP4h8Fx_j1XtUCL2GUYI_bVx0,o75mP4lxQlTTDWqq4cc2z5UybL2U,o75mP4kU0R4AdsaNNqg2vwlmk8WI,o75mP4lXrEhTmYlGyPgT2HUfmpI4,o75mP4mv_8pbddIc0utXIUGuR_sQ,","recommend":"严选,热门","yajin":null,"homerecommend":"首页推荐","bq1":null,"bq2":null,"bq3":null,"bq4":null,"bq5":null,"bq6":null,"press":null,"ystatus":"0","youji":null,"author":null,"weizhi":null,"source":"1","tags":"WIFI,幕布,发票,投影仪,激光笔,转换器,音响话筒,电源插座,","content2":null,"remark":"","lat":"32.061072","lng":"118.867482","jw":"118.867482,32.061072","xingzhengqu":"玄武区,","shangyequ":"中山陵,","ditiexian":"2号线-孝陵卫,2号线-钟灵街,","useoldposition":"","samepositioncount":"1","image":"https://imeeting.jiuze9.com/imeeting_new/Public/Uploads/223435cf239849533f.jpg"}]
     * result : success
     */

    private String result;
    private List<MeetingsBean> meetings;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<MeetingsBean> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<MeetingsBean> meetings) {
        this.meetings = meetings;
    }

    public static class MeetingsBean {
        /**
         * id : 10197
         * province : null
         * city : 南京
         * area : null
         * kind : 会议
         * title : 爱米厅共享空间-会议室A
         * content : 爱米厅共享会议空间是爱米厅公司自建的第一个实验性空间产品，空间定位商务会议需要，主要针对在新街口附近工作的商务人士，或对会议空间有临时需要的外勤人员，空间管理实现智能化，无人化。

         所有会议需要的硬件智能设备一应俱全，包括智能的多媒体屏幕（能够实现投影，白板，截屏，上网等功能）
         * mianji : 22m²
         * shop : 274
         * shopname : 爱米厅共享空间
         * create_time : 1536565205
         * update_time : 1559139153
         * hot : 9999
         * score : 5
         * tel : 17705151588
         * positionimage : 142915ba50e317c22a.png
         * youhuiquan : null
         * openingdays : 周一,周二,周三,周四,周五,周六,周日
         * openingtime : 07:00-23:00
         * openingtimebegin : 07:00
         * openingtimeend : 23:00
         * address : 南京市汉中路27号新街口友谊广场26层c区
         * status : 1
         * number : 12
         * fitnumber : 12
         * slogan : 智能 高效 便捷 私密
         * oldprice : 150.00
         * price : 99.00
         * a : null
         * d : null
         * p : null
         * s : null
         * f : null
         * sell : 38
         * type : null
         * goodstype : null
         * goodstypewords : 商务会议,商务培训,文化交流,活动聚会,拍摄录制,亲子活动,
         * user : 管理员
         * special : 1、空间2小时起订
         * special1 : 2小时
         * special2 : 可以
         * special3 : 不可以
         * special4 : 可以
         * special5 :
         * special6 :
         * rule1 : 2小时
         * rule2 : 10%
         * rule3 : 收取定金80%
         * image1 : 82035bab77eda2ad0.jpg
         * image2 : 120085bab77eda2c41.jpg
         * image3 : 227855bab77eda2e3c.jpg
         * image4 : 255105bab77eda2f5a.jpg
         * image5 : 127755bab77eda30a5.jpg
         * image6 : 208845bab77eda31bf.jpg
         * image7 :
         * image8 : null
         * image9 : null
         * image10 : null
         * image11 : null
         * image12 : null
         * image13 : null
         * image14 : null
         * image15 : null
         * image16 : null
         * image17 : null
         * image18 : null
         * image19 : null
         * image20 : null
         * click : 7370
         * oncount : 152
         * person : 1
         * openid : o75mP4mU_oLHJRS1J_lykQI3Xk6g,o75mP4lerOlujHOzJV6WHgkx0NEY,o75mP4mv_8pbddIc0utXIUGuR_sQ,o75mP4t8Ux-mRZwSyfDXHvfg5VUo,o75mP4oE1mpktZVrEKN5jqgxP4Vs,null,o75mP4hQVV9WJV3RTFlct5Xw_vzU,o75mP4u8OAZ4c4h8nvyEncTK3wL0,o75mP4iLJPmEosUjdBi6c0xLMpdg,o75mP4lPsDpKRn3kFKztRCJmOuTQ,o75mP4iTyr5HoXYOtkHYFLkm6wW0,undefined,o75mP4otXs3_Sp215_bCuHuG0A0o,o75mP4qzsvzQ8GSv4NypuKHcIoHc,o75mP4lpXCjc0qhOVMdp5HCNiWc4,o75mP4mQrj-OoupSWz85nnXgWm4s,oUZP64uJEU_BXkrSfMSZmsTV5hJQ,o75mP4q3e9ThsoyIqv4PGTwzy_nk,o75mP4gx1LSK-MCOV-_d6OnnFC84,oUZP64kmmUmuYR_GMROdXHdMSWZ4,o75mP4rhV0QVHPeMD2bWFLNM0hRI,o75mP4ludRpTwgluErglu2gaaVrw,o75mP4tZRSIk6SsbdD0-LTACMAD0,o75mP4iiF6UxafhcMJ3ubEU0yNFU,o75mP4uwqTo6Gnz0BoVkKpI10BYM,o75mP4kKasvKivmlIb73ifnXPNFI,o75mP4jlIuEXojPfZRMpZcrIuSPk,o75mP4mMj1iRmiu6u-bP6S3A2mYM,oUZP64vtvVTAAql8mJs75uLGR6JE,o75mP4qVImWdEQL8DOzQXtrF-T6w,o75mP4jX_SQmhw-oF1oiCN9YwOvc,o75mP4pPbB9FOj1Q2djwn-WfJCIc,o75mP4iQ308Cph2tunISjBPEJrnM,o75mP4qGovXbHODcWbMwlTLsKXxg,o75mP4iZPGTWPTNJNa1kPk7cvxZM,o75mP4sCUsWUM7EqKynkaq_maaR4,o75mP4n_Ybtj5EilEzzPnkf_pgFk,o75mP4rjHZJMr08ptyGHHjNNBWJw,o75mP4tiNUzoSmWp6yzuCouhy_I4,o75mP4vxHfn7KhFXaValjqYdB3GQ,o75mP4iQXa67Y4WAQnzyQ6ztsBjM,o75mP4mIwpispcdeLC_ChIL-VXB4,o75mP4p6mzx9gyTBCQVEMhx2l808,o75mP4rSwDzu8ArjdtM_hLqHKHXk,o75mP4rrnk6P3VwLKqk_CE-1oJKE,o75mP4hgFCumnF_OCnxUNX1B1aS8,o75mP4hUfb8HanIlJzEwhFNnohZ8,o75mP4iDqQGyGxmy9xPUDQG4VXu0,o75mP4irtUmrnCCyFCnt_RlrCMsM,o75mP4qxxo9ItRsRq7mwOVX4xGS4,o75mP4g_avnBfmPHZFfvpbm4EaHQ,o75mP4hqwpAH0J6uFWowgRvzuhlc,o75mP4rrm_QLR81Shi3Ta6u8JQdw,o75mP4ng8GE8A0V33RP2KLtVdS_0,o75mP4rNerRlmSPhE9Riqy0zMal8,o75mP4vwXu1tdYmn7Zvyn4FNTLy0,o75mP4jdD1pYQ_vrizN9BaohH3GE,o75mP4sHN8Vf63Y6c4wxPPN5dLi8,o75mP4qACH51gjV3KRcXG7O-XYEQ,o75mP4jDiNuR_DkLbswMnexynvyQ,o75mP4tXjRp4rXu1mo0-OaspTYGE,o75mP4tLxiBdYkCSJ5Bc11MqBMzQ,o75mP4mBOzYG36GHXLizOVXrs_KQ,o75mP4ogqoPb342HvOWkqa1oG430,o75mP4oDkpt4WK3cz-w-zVbaLjpQ,o75mP4vy-V4gMDM7lGJ1LG4krOXM,o75mP4tS3DSL40k2azj1rL2LtKog,o75mP4sw1lseQE1QbLmo9w1QdrCg,o75mP4n6pYJnMfHH1oZLABJTGPkU,o75mP4lm5_KcgTsDgemxD99MZkJU,o75mP4i_Jw77mYu6TLrck5Vlyu3c,o75mP4vDmHl_uqgDNm0GEbuUl4yU,o75mP4ti4hUPzIT2l3nuWE5GCRTw,o75mP4qbwg-f7eFqnXcHQqIluYBY,o75mP4rTx_0qs0VddeMy1rdPNgZQ,o75mP4qsFcYRCvlFGqEeLzjDKTRw,o75mP4oWE46DkJGjyFifCHTau8XI,o75mP4pgmaoNwrFdlusCopUQ5Plg,o75mP4iW9b5h2tFPj3EV9QHqJdjA,o75mP4r1DO1Zs-xJ2El6EnATk2zU,o75mP4rqgpiDo38j3DAOXFBAR6MQ,o75mP4pcZFWImHVbxkY7-_MgB2Z0,o75mP4kUSLOLBlkca1qioI5sA4Ak,o75mP4gh9PQVggRq0nmYUkE39S4I,o75mP4mpbBCxryTs5L6CJSlscTx4,o75mP4rmLbfJu3AirLOyDutNKnLQ,o75mP4u60MFvqXPwkV8E7ZxBk90I,o75mP4gtLanRjIVji2o55mzNurGA,o75mP4u_QBMwvj-WKdzdz-9RDUpU,o75mP4lN6R-Nuq2Qc7q3TiHLulUU,o75mP4tF7Niy8solzv9QKdf6_ok4,o75mP4oS21avIuorAacR86qGcjk0,o75mP4mK0jX_6jJbkxb8NshopTPw,o75mP4lA8F3u3SHLI1_wtWAe4npQ,o75mP4pEYL7ErKKOfdSAeymNW-Hg,o75mP4oBxSKj3xI7Y3YhnMzeEdMI,o75mP4lAEsLjKvWe7Xg-nAEvhtkE,oUZP64jA28lzVkGpO8Dk3RGk1Sis,o75mP4ipoCIGZx39267rNs5vwNHU,o75mP4u3xzyMYjHvdDkOWoyWEOLc,o75mP4msZUq2JH4O7OC0UviAfw40,o75mP4iGgubSMH5SGXoTlDld0Yws,o75mP4iNV1fPq9oYmQInJb7pqc7I,o75mP4lt-qO6ho4gLPFOnrmwrQK4,o75mP4ujlfa9_dEA9vsMcSrwJHL4,o75mP4jyLvLnlK4V1tTle5c-XBZQ,o75mP4pb3PDGhOte0oGUSrg-MwdQ,o75mP4pgEWpxhENUfTGDpmB_CywA,o75mP4pB0Pg08Qm49tw_Bxv21SlM,o75mP4jBKnH0IZwSa_bTsqP9SHmg,o75mP4gytoFLx2SVyOYBC2q5b3Eo,o75mP4vKEGIhUAaXOjt2shSXJcDA,o75mP4gDX6NylUHlEk2ADhohda30,o75mP4gJuDXrMo-uSHL9fFqSmjHs,o75mP4p7Zu-sL3gNJyGA5clF6zFY,o75mP4lG_ZL3hLXOYbUWDn2KS0gA,o75mP4huAI3d-ppiFtXehaxRCxy4,o75mP4ooRFBeUoZRkTj0__g-Qy8M,o75mP4rFWDDTxASI0y2Yux-TigIE,o75mP4gY5hNCztAHHi4dqNxsJnhU,o75mP4tIb5xl_5cRPklK6kEnweF0,o75mP4qoO92I4EdPn9m-Z2zDzJRw,o75mP4hoTS6amBM3Eki-a8Irvwy8,o75mP4nnrFrlT9mvpF6496K9_jFE,o75mP4tuPhqu7XoF3lssLtyMzDZ4,o75mP4hicarL895Op3luBXofPrkg,o75mP4ji4or-Hh22Lomvv963GORw,o75mP4k8VwCKN2O_-_bdh-LDf_eo,o75mP4vGey_LGU3kefqgBJ42Yki8,o75mP4pOmEjdLF5fiviRqop2BH-M,o75mP4sgL8x07A6IwGJYkkq5zugE,o75mP4izt1GVZJvJ5Zk21hUgQEH4,o75mP4qEcZZypmJed4x1L68oGHkg,o75mP4nTrrHcHgBE_Mp6Ph80gEzM,o75mP4qDxHTr-WcMIDZUCZiKnP-I,o75mP4l7apfVSQSXGPc0Id6tuzCs,o75mP4ofTAieICeXtz8a3kHWZaBc,o75mP4juz4yFuBD0Y0OjZjq-DTd0,o75mP4ksZEGtUHHxvhpFOTi_TwrE,o75mP4i0aylgPuD62c0LsgwUUj3M,o75mP4jv6Xas9jIMzGhYgh1JSmUI,o75mP4vjSQv3goGlXa8LXDUE-h2k,o75mP4nEu4EKXvnJ1mx5_jsUqHqk,o75mP4qjM5DH9oAmuNN6F4jsG8eg,o75mP4qJS9YJrTFdPm2x6AELkAeU,o75mP4r0YcOxBjDRlYyXVvhkabMk,o75mP4l3IsNplOV_-1x4rvx15osE,o75mP4iyn7ILtPA2QkIv7OAMmYzU,o75mP4hseeUEu8w1euwJ9rudpLzI,o75mP4i1dFE8x4yVjAEruKugJdHI,o75mP4vc9w3dWAvIrqBfKIVCi-JI,o75mP4jF5uKyVq9x3FZrrHT4mNhM,o75mP4gHWHTG3V6jKWbf4VgnysNY,o75mP4rYFC_I_OtqPS4zvrPySiX4,o75mP4tHM1Wzx_iEzXy9BX2fDTTU,o75mP4vZ4L1AtYTRHMrwt7sKvkYI,o75mP4sgnmPqSuxzNlODh93bZoTY,o75mP4pSTCv4d1s1uAfkWXJw8XGc,o75mP4uhwbyjzJre0eyI3Vm2MoRE,o75mP4s0306KPyB9tnYs9AhNqBKo,o75mP4pMR7MTwktPgg-qBIOYB4lg,o75mP4ki0NIgEHuGYn75lx5pEhHM,o75mP4uBV9-Wd3rgta-KMOjvmtNM,o75mP4gKGrwvsvrl01p3DvrKke7E,o75mP4k2OLW6TQpnaKly-B1KQvpo,o75mP4iL1KY1F0X98LHXqhz67SJA,o75mP4mcK3XPZSvavVzk2jcoDXKA,o75mP4rc0NrGYOrfHx4RHD0SUp4o,o75mP4ul7DEiCBM6tLmn7FQ-evKs,o75mP4vlpgZ-5wovn4qZ28eObsw8,o75mP4v_RReu5Un0eMsuZ4rlD_HM,o75mP4rR1ZNTFjSlPMN5BdInTj5c,o75mP4t0USrJin9kG9qSiPzKra9M,o75mP4spGb_O99tPzjFP_ctF_UVM,o75mP4ssCWsW7fpnnVAy2NPW7cLI,o75mP4vFnvKHHgZbPCU-_m84zfWU,o75mP4mi5buFepKPiApoy2QOOPe4,o75mP4vamcX-RpjqsrONit7-sj3M,o75mP4q3MpJGnaOFEMtc6mXJ4clU,o75mP4gmQt0Xtw-rGp-YXzCMk-UM,o75mP4lxQlTTDWqq4cc2z5UybL2U,o75mP4vsnR7J-nLwxu4XUYfCYKe4,o75mP4mRau4i4K3EQa5jJQ5HExcw,o75mP4mXb99zYvh6jhkeGJ4xrO-o,o75mP4sbUxUEF8x13n2x0UlGbdws,o75mP4tDAhwLwH_tYrHVyJZp4XPI,o75mP4hyoA2Jull42xBtL4AsAV5E,o75mP4puJ-WqX5cR2X_mgUQgYkng,o75mP4oOAd5aukKQbRRH-3P2IANE,o75mP4gKhw1FCxFn5ZZ2jfMWXFsk,o75mP4gQQqwHp99xWxYvH_DwujXI,o75mP4klLpgapABQ7u6KYy0ceRgM,o75mP4ou7XfSmG-DOKJAEwjGJt68,o75mP4kq5aFF1ySSvOBitukkVZgU,o75mP4luqobDgF8KYf2HQAXfSMY4,o75mP4tqbbzDXaSpnJgHyXpV3SRc,o75mP4hBjmW1R0yRkg1tUGsPBYQ4,oUZP64gFahwEkWdh5Jijw2qeNysc,o75mP4oEJBvJtZpnlm2yjbNg1RYE,o75mP4h4EvJsIf-9B1p4csLDu0rs,o75mP4j0guSw4_t5gK5AVwYwy-CA,o75mP4pm6X3W-yjpOcKzj6NLI5CU,o75mP4jj0qc9hZ-lAkY4jKiLC628,o75mP4q7-Sy61vLnVpOi4dyNXo0M,o75mP4tQB5lE_jBGD6NISujDpsLg,o75mP4iJEB9Z_ggOJaPxxhUH2TTg,o75mP4u07K6yuGfdtRA_cw0tVOqU,o75mP4m_mhX6QRuOCjudfyfOcwGw,o75mP4sfz2gEFIwvEm-ncZKc6D7Q,o75mP4vqZkJoN1gw1vmru6ZUvN7w,o75mP4u68hngU2E8-D55QVd2Sydc,o75mP4jrtbRtz2u6WrvmTv8PNUHs,o75mP4n-9C2ISWYxP5UFPAmuVaSw,o75mP4vh63zCMK29hBMz1uj8IplU,o75mP4qFLVn-EVu7QlonA_92uBmU,o75mP4py1ZI_e3DOjG0nYJ89siUs,o75mP4s_cmtXKRe9St2AK_pbCtnM,o75mP4sC75DaywYpFaSEY6VTDP24,o75mP4r0383wuzZ2i9qKKUXg94jA,o75mP4gk-PFTDO-2px-IFpD6u4W0,o75mP4oifZAWbFJuKMK8d1muo0fA,o75mP4u_pBxPks1j_P7ykfsnHIRs,o75mP4sRSJ-CxadTiKieRlbIIZnc,o75mP4jBLQxA0QgyIeMMumgO2W4c,o75mP4ia4WlQ-7ZrvXpGVCXm50vk,o75mP4h3wDLNrhygaC4RFiHtCJ9U,o75mP4nrFRJR0QLNFheuOTB6rJz4,o75mP4vDXm8JlBhkA3rIKGgjRu3E,o75mP4m_s1MhITaRjX73-DsIQt_c,o75mP4kU0R4AdsaNNqg2vwlmk8WI,o75mP4nQ_dpkKx-3L7pYqlHT-Z1s,o75mP4gRrc2AcJeVeG0yUT39d7qU,o75mP4hkrm2JvaqSCCwgy8zIiQ3c,o75mP4uNG1z9jh2oY4teoe6kXcnE,o75mP4rRM-iok2ioJaZCmWTxO7yI,o75mP4toeNUSPJdTVPiImqxGBWCE,o75mP4lCXS_RVEdrc5vuDDLZxD5k,o75mP4o1O31gAe4DN63zd-BgYL3Q,o75mP4iMvT39-RFKLYrlhH_eO7V8,o75mP4hmZ7fxYYH97TC58RrEyV9k,o75mP4tYPw3_I2_hZ1UTf9YHMc80,o75mP4mIH-zg4C44GGojZ_zNb5hY,o75mP4nTVoY47oQdregYkM7L9SsQ,o75mP4sR3d4_mbPFb3kkX0Xo7s_k,o75mP4knDFZftiSJB6b6uZKMKlBk,o75mP4vWiqycHhuCI9nKmhTLhxFM,o75mP4jbpeXprT3GsM8tBe-zB3Ws,o75mP4pKsW86a8wjumSVySQ59LF8,o75mP4ltP87mWL6WwmFyutz6RNqM,o75mP4nUQcdu71eUEiQo_OIBK2VU,o75mP4jphQpvHP5bc3juKAgBN650,o75mP4t50UPqXdT1V7s3YPThmI8I,o75mP4tTQun5HFh0LqpDCPjcLQJU,o75mP4uv1Fp5sPfnlW4-qY2OyeZA,o75mP4tQagCP8yAtfZWnfVE7IgII,o75mP4roS2ibY4M8Ao5LBykotlDs,o75mP4gxmaGa9uvVL_q9EtH5UKbQ,o75mP4mSbGZkBY-9pkW-kuuya_lA,o75mP4oJH05GKqmLrC-YN0t6aMzE,o75mP4rnVZl1ju3pLDBFTtSstaHM,o75mP4rOqFKico2jIT_fpYYjw_Xs,o75mP4qh19tgsY4y6l5szvOmpuvk,o75mP4sQiG_pdOBDj8Dg6vRLdsno,o75mP4iHX5spvdYb-s__Kj6B5qTE,o75mP4uPUf3gqdI8pKCe8zkHez8M,o75mP4mJEqyzGwhFv4HlWILkHkz0,o75mP4laI7uS1Q2wbPNFRGx4Xz5c,o75mP4vLSIKTT8b1jqC6CXpKwvOk,o75mP4hAgbYTBmM8SHStB0ePAdcQ,o75mP4lpguBrL-ZqoTu1uXxvUltk,o75mP4mZha3WC8xYmQl7O9G9iGC4,o75mP4rj6Og2ry8qLlPbsro8wt9U,o75mP4hNSfuVBOKhrN8aog9ZKBaw,o75mP4gVuT0zAirhjC-dEmR9548M,o75mP4neviRRIimGFG5jfnohDnl8,o75mP4mvj1DOfxqKfNcEiCC5d24Y,o75mP4r-rq5xBkU_IAIT69j4cNzs,o75mP4uDrsC2VE70ed4T3y9u4qKY,o75mP4pAfApJomXeydxiPSOzdqiA,o75mP4hVFYCEvSeSEM08G_xrLqWs,o75mP4lSy0N4UqqwjMlUVX259h34,o75mP4uJPL9yJj6TrFTnEZRxwR2A,o75mP4lgLoEurvfRW9rZ9mboXZ94,o75mP4g7DFupCIrcx1h78IQT66Z0,o75mP4mYp5iI-8zCqpooV6lDZVho,o75mP4lN5d1vTOs7zQvglXpu4Enw,o75mP4pSUWDTqMoyumKA6PEqxx1o,o75mP4hM6SXKLCd81RpvTAIujeLM,o75mP4gozFZ9FF8-2AqsELruU43k,o75mP4sPjxIjXW8S9ehLUOSOpCdM,o75mP4qAKJlaTD6OIVO9tpHAmESk,o75mP4rBokVvqwZ4nxa27LSpIijM,o75mP4ggXnqApbfYuh2128rBL12w,o75mP4oSai8k-ILJx24tVPQY4IwA,o75mP4thPLcJdx0InE43ZnXBkDG4,o75mP4hcHJRcKVahGu7zqpMlq2NQ,o75mP4rbPVyAyYrHk2iX8ggI40H4,
         * recommend : 严选,特惠,热门
         * yajin : null
         * homerecommend : 首页推荐
         * bq1 : null
         * bq2 : null
         * bq3 : null
         * bq4 : null
         * bq5 : null
         * bq6 : null
         * press : null
         * ystatus : 0
         * youji : null
         * author : null
         * weizhi : null
         * source : 1
         * tags : WIFI,白板,茶歇,打印,纸笔,发票,投影仪,激光笔,转换器,多媒体屏,蓝牙音箱,电源插座,智能翻译,
         * content2 : null
         * remark :
         * lat : 32.047912
         * lng : 118.788211
         * jw : 118.788211,32.047912
         * xingzhengqu : 秦淮区,
         * shangyequ : 新街口,
         * ditiexian : 1号线-新街口,2号线-新街口,
         * useoldposition : 10200
         * samepositioncount : 2
         * image : https://imeeting.jiuze9.com/imeeting_new/Public/Uploads/82035bab77eda2ad0.jpg
         */

        private String id;
        private Object province;
        private String city;
        private Object area;
        private String kind;
        private String title;
        private String content;
        private String mianji;
        private String shop;
        private String shopname;
        private String create_time;
        private String update_time;
        private String hot;
        private String score;
        private String tel;
        private String positionimage;
        private Object youhuiquan;
        private String openingdays;
        private String openingtime;
        private String openingtimebegin;
        private String openingtimeend;
        private String address;
        private String status;
        private String number;
        private String fitnumber;
        private String slogan;
        private String oldprice;
        private String price;
        private Object a;
        private Object d;
        private Object p;
        private Object s;
        private Object f;
        private String sell;
        private Object type;
        private Object goodstype;
        private String goodstypewords;
        private String user;
        private String special;
        private String special1;
        private String special2;
        private String special3;
        private String special4;
        private String special5;
        private String special6;
        private String rule1;
        private String rule2;
        private String rule3;
        private String image1;
        private String image2;
        private String image3;
        private String image4;
        private String image5;
        private String image6;
        private String image7;
        private Object image8;
        private Object image9;
        private Object image10;
        private Object image11;
        private Object image12;
        private Object image13;
        private Object image14;
        private Object image15;
        private Object image16;
        private Object image17;
        private Object image18;
        private Object image19;
        private Object image20;
        private String click;
        private String oncount;
        private String person;
        private String openid;
        private String recommend;
        private Object yajin;
        private String homerecommend;
        private Object bq1;
        private Object bq2;
        private Object bq3;
        private Object bq4;
        private Object bq5;
        private Object bq6;
        private Object press;
        private String ystatus;
        private Object youji;
        private Object author;
        private Object weizhi;
        private String source;
        private String tags;
        private Object content2;
        private String remark;
        private String lat;
        private String lng;
        private String jw;
        private String xingzhengqu;
        private String shangyequ;
        private String ditiexian;
        private String useoldposition;
        private String samepositioncount;
        private String image;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Object getProvince() {
            return province;
        }

        public void setProvince(Object province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public Object getArea() {
            return area;
        }

        public void setArea(Object area) {
            this.area = area;
        }

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getMianji() {
            return mianji;
        }

        public void setMianji(String mianji) {
            this.mianji = mianji;
        }

        public String getShop() {
            return shop;
        }

        public void setShop(String shop) {
            this.shop = shop;
        }

        public String getShopname() {
            return shopname;
        }

        public void setShopname(String shopname) {
            this.shopname = shopname;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public String getHot() {
            return hot;
        }

        public void setHot(String hot) {
            this.hot = hot;
        }

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getPositionimage() {
            return positionimage;
        }

        public void setPositionimage(String positionimage) {
            this.positionimage = positionimage;
        }

        public Object getYouhuiquan() {
            return youhuiquan;
        }

        public void setYouhuiquan(Object youhuiquan) {
            this.youhuiquan = youhuiquan;
        }

        public String getOpeningdays() {
            return openingdays;
        }

        public void setOpeningdays(String openingdays) {
            this.openingdays = openingdays;
        }

        public String getOpeningtime() {
            return openingtime;
        }

        public void setOpeningtime(String openingtime) {
            this.openingtime = openingtime;
        }

        public String getOpeningtimebegin() {
            return openingtimebegin;
        }

        public void setOpeningtimebegin(String openingtimebegin) {
            this.openingtimebegin = openingtimebegin;
        }

        public String getOpeningtimeend() {
            return openingtimeend;
        }

        public void setOpeningtimeend(String openingtimeend) {
            this.openingtimeend = openingtimeend;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getFitnumber() {
            return fitnumber;
        }

        public void setFitnumber(String fitnumber) {
            this.fitnumber = fitnumber;
        }

        public String getSlogan() {
            return slogan;
        }

        public void setSlogan(String slogan) {
            this.slogan = slogan;
        }

        public String getOldprice() {
            return oldprice;
        }

        public void setOldprice(String oldprice) {
            this.oldprice = oldprice;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public Object getA() {
            return a;
        }

        public void setA(Object a) {
            this.a = a;
        }

        public Object getD() {
            return d;
        }

        public void setD(Object d) {
            this.d = d;
        }

        public Object getP() {
            return p;
        }

        public void setP(Object p) {
            this.p = p;
        }

        public Object getS() {
            return s;
        }

        public void setS(Object s) {
            this.s = s;
        }

        public Object getF() {
            return f;
        }

        public void setF(Object f) {
            this.f = f;
        }

        public String getSell() {
            return sell;
        }

        public void setSell(String sell) {
            this.sell = sell;
        }

        public Object getType() {
            return type;
        }

        public void setType(Object type) {
            this.type = type;
        }

        public Object getGoodstype() {
            return goodstype;
        }

        public void setGoodstype(Object goodstype) {
            this.goodstype = goodstype;
        }

        public String getGoodstypewords() {
            return goodstypewords;
        }

        public void setGoodstypewords(String goodstypewords) {
            this.goodstypewords = goodstypewords;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getSpecial() {
            return special;
        }

        public void setSpecial(String special) {
            this.special = special;
        }

        public String getSpecial1() {
            return special1;
        }

        public void setSpecial1(String special1) {
            this.special1 = special1;
        }

        public String getSpecial2() {
            return special2;
        }

        public void setSpecial2(String special2) {
            this.special2 = special2;
        }

        public String getSpecial3() {
            return special3;
        }

        public void setSpecial3(String special3) {
            this.special3 = special3;
        }

        public String getSpecial4() {
            return special4;
        }

        public void setSpecial4(String special4) {
            this.special4 = special4;
        }

        public String getSpecial5() {
            return special5;
        }

        public void setSpecial5(String special5) {
            this.special5 = special5;
        }

        public String getSpecial6() {
            return special6;
        }

        public void setSpecial6(String special6) {
            this.special6 = special6;
        }

        public String getRule1() {
            return rule1;
        }

        public void setRule1(String rule1) {
            this.rule1 = rule1;
        }

        public String getRule2() {
            return rule2;
        }

        public void setRule2(String rule2) {
            this.rule2 = rule2;
        }

        public String getRule3() {
            return rule3;
        }

        public void setRule3(String rule3) {
            this.rule3 = rule3;
        }

        public String getImage1() {
            return image1;
        }

        public void setImage1(String image1) {
            this.image1 = image1;
        }

        public String getImage2() {
            return image2;
        }

        public void setImage2(String image2) {
            this.image2 = image2;
        }

        public String getImage3() {
            return image3;
        }

        public void setImage3(String image3) {
            this.image3 = image3;
        }

        public String getImage4() {
            return image4;
        }

        public void setImage4(String image4) {
            this.image4 = image4;
        }

        public String getImage5() {
            return image5;
        }

        public void setImage5(String image5) {
            this.image5 = image5;
        }

        public String getImage6() {
            return image6;
        }

        public void setImage6(String image6) {
            this.image6 = image6;
        }

        public String getImage7() {
            return image7;
        }

        public void setImage7(String image7) {
            this.image7 = image7;
        }

        public Object getImage8() {
            return image8;
        }

        public void setImage8(Object image8) {
            this.image8 = image8;
        }

        public Object getImage9() {
            return image9;
        }

        public void setImage9(Object image9) {
            this.image9 = image9;
        }

        public Object getImage10() {
            return image10;
        }

        public void setImage10(Object image10) {
            this.image10 = image10;
        }

        public Object getImage11() {
            return image11;
        }

        public void setImage11(Object image11) {
            this.image11 = image11;
        }

        public Object getImage12() {
            return image12;
        }

        public void setImage12(Object image12) {
            this.image12 = image12;
        }

        public Object getImage13() {
            return image13;
        }

        public void setImage13(Object image13) {
            this.image13 = image13;
        }

        public Object getImage14() {
            return image14;
        }

        public void setImage14(Object image14) {
            this.image14 = image14;
        }

        public Object getImage15() {
            return image15;
        }

        public void setImage15(Object image15) {
            this.image15 = image15;
        }

        public Object getImage16() {
            return image16;
        }

        public void setImage16(Object image16) {
            this.image16 = image16;
        }

        public Object getImage17() {
            return image17;
        }

        public void setImage17(Object image17) {
            this.image17 = image17;
        }

        public Object getImage18() {
            return image18;
        }

        public void setImage18(Object image18) {
            this.image18 = image18;
        }

        public Object getImage19() {
            return image19;
        }

        public void setImage19(Object image19) {
            this.image19 = image19;
        }

        public Object getImage20() {
            return image20;
        }

        public void setImage20(Object image20) {
            this.image20 = image20;
        }

        public String getClick() {
            return click;
        }

        public void setClick(String click) {
            this.click = click;
        }

        public String getOncount() {
            return oncount;
        }

        public void setOncount(String oncount) {
            this.oncount = oncount;
        }

        public String getPerson() {
            return person;
        }

        public void setPerson(String person) {
            this.person = person;
        }

        public String getOpenid() {
            return openid;
        }

        public void setOpenid(String openid) {
            this.openid = openid;
        }

        public String getRecommend() {
            return recommend;
        }

        public void setRecommend(String recommend) {
            this.recommend = recommend;
        }

        public Object getYajin() {
            return yajin;
        }

        public void setYajin(Object yajin) {
            this.yajin = yajin;
        }

        public String getHomerecommend() {
            return homerecommend;
        }

        public void setHomerecommend(String homerecommend) {
            this.homerecommend = homerecommend;
        }

        public Object getBq1() {
            return bq1;
        }

        public void setBq1(Object bq1) {
            this.bq1 = bq1;
        }

        public Object getBq2() {
            return bq2;
        }

        public void setBq2(Object bq2) {
            this.bq2 = bq2;
        }

        public Object getBq3() {
            return bq3;
        }

        public void setBq3(Object bq3) {
            this.bq3 = bq3;
        }

        public Object getBq4() {
            return bq4;
        }

        public void setBq4(Object bq4) {
            this.bq4 = bq4;
        }

        public Object getBq5() {
            return bq5;
        }

        public void setBq5(Object bq5) {
            this.bq5 = bq5;
        }

        public Object getBq6() {
            return bq6;
        }

        public void setBq6(Object bq6) {
            this.bq6 = bq6;
        }

        public Object getPress() {
            return press;
        }

        public void setPress(Object press) {
            this.press = press;
        }

        public String getYstatus() {
            return ystatus;
        }

        public void setYstatus(String ystatus) {
            this.ystatus = ystatus;
        }

        public Object getYouji() {
            return youji;
        }

        public void setYouji(Object youji) {
            this.youji = youji;
        }

        public Object getAuthor() {
            return author;
        }

        public void setAuthor(Object author) {
            this.author = author;
        }

        public Object getWeizhi() {
            return weizhi;
        }

        public void setWeizhi(Object weizhi) {
            this.weizhi = weizhi;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public Object getContent2() {
            return content2;
        }

        public void setContent2(Object content2) {
            this.content2 = content2;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public String getJw() {
            return jw;
        }

        public void setJw(String jw) {
            this.jw = jw;
        }

        public String getXingzhengqu() {
            return xingzhengqu;
        }

        public void setXingzhengqu(String xingzhengqu) {
            this.xingzhengqu = xingzhengqu;
        }

        public String getShangyequ() {
            return shangyequ;
        }

        public void setShangyequ(String shangyequ) {
            this.shangyequ = shangyequ;
        }

        public String getDitiexian() {
            return ditiexian;
        }

        public void setDitiexian(String ditiexian) {
            this.ditiexian = ditiexian;
        }

        public String getUseoldposition() {
            return useoldposition;
        }

        public void setUseoldposition(String useoldposition) {
            this.useoldposition = useoldposition;
        }

        public String getSamepositioncount() {
            return samepositioncount;
        }

        public void setSamepositioncount(String samepositioncount) {
            this.samepositioncount = samepositioncount;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
}
