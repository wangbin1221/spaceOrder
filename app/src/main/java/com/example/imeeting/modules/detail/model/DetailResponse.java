package com.example.imeeting.modules.detail.model;

import java.util.List;

/**
 * description:
 * created by wangbin on 2019/6/9
 */
public class DetailResponse {

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
     * positionimage : https://imeeting.jiuze9.com/imeeting_new/Public/Uploads/142915ba50e317c22a.png
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
     * image1 : https://imeeting.jiuze9.com/imeeting_new/Public/Uploads/82035bab77eda2ad0.jpg
     * image2 : https://imeeting.jiuze9.com/imeeting_new/Public/Uploads/120085bab77eda2c41.jpg
     * image3 : https://imeeting.jiuze9.com/imeeting_new/Public/Uploads/227855bab77eda2e3c.jpg
     * image4 : https://imeeting.jiuze9.com/imeeting_new/Public/Uploads/255105bab77eda2f5a.jpg
     * image5 : https://imeeting.jiuze9.com/imeeting_new/Public/Uploads/127755bab77eda30a5.jpg
     * image6 : https://imeeting.jiuze9.com/imeeting_new/Public/Uploads/208845bab77eda31bf.jpg
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
     * click : 7501
     * oncount : 153
     * person : 1
     * openid : o75mP4mU_oLHJRS1J_lykQI3Xk6g,o75mP4lerOlujHOzJV6WHgkx0NEY,o75mP4mv_8pbddIc0utXIUGuR_sQ,o75mP4t8Ux-mRZwSyfDXHvfg5VUo,o75mP4oE1mpktZVrEKN5jqgxP4Vs,null,o75mP4hQVV9WJV3RTFlct5Xw_vzU,o75mP4u8OAZ4c4h8nvyEncTK3wL0,o75mP4iLJPmEosUjdBi6c0xLMpdg,o75mP4lPsDpKRn3kFKztRCJmOuTQ,o75mP4iTyr5HoXYOtkHYFLkm6wW0,undefined,o75mP4otXs3_Sp215_bCuHuG0A0o,o75mP4qzsvzQ8GSv4NypuKHcIoHc,o75mP4lpXCjc0qhOVMdp5HCNiWc4,o75mP4mQrj-OoupSWz85nnXgWm4s,oUZP64uJEU_BXkrSfMSZmsTV5hJQ,o75mP4q3e9ThsoyIqv4PGTwzy_nk,o75mP4gx1LSK-MCOV-_d6OnnFC84,oUZP64kmmUmuYR_GMROdXHdMSWZ4,o75mP4rhV0QVHPeMD2bWFLNM0hRI,o75mP4ludRpTwgluErglu2gaaVrw,o75mP4tZRSIk6SsbdD0-LTACMAD0,o75mP4iiF6UxafhcMJ3ubEU0yNFU,o75mP4uwqTo6Gnz0BoVkKpI10BYM,o75mP4kKasvKivmlIb73ifnXPNFI,o75mP4jlIuEXojPfZRMpZcrIuSPk,o75mP4mMj1iRmiu6u-bP6S3A2mYM,oUZP64vtvVTAAql8mJs75uLGR6JE,o75mP4qVImWdEQL8DOzQXtrF-T6w,o75mP4jX_SQmhw-oF1oiCN9YwOvc,o75mP4pPbB9FOj1Q2djwn-WfJCIc,o75mP4iQ308Cph2tunISjBPEJrnM,o75mP4qGovXbHODcWbMwlTLsKXxg,o75mP4iZPGTWPTNJNa1kPk7cvxZM,o75mP4sCUsWUM7EqKynkaq_maaR4,o75mP4n_Ybtj5EilEzzPnkf_pgFk,o75mP4rjHZJMr08ptyGHHjNNBWJw,o75mP4tiNUzoSmWp6yzuCouhy_I4,o75mP4vxHfn7KhFXaValjqYdB3GQ,o75mP4iQXa67Y4WAQnzyQ6ztsBjM,o75mP4mIwpispcdeLC_ChIL-VXB4,o75mP4p6mzx9gyTBCQVEMhx2l808,o75mP4rSwDzu8ArjdtM_hLqHKHXk,o75mP4rrnk6P3VwLKqk_CE-1oJKE,o75mP4hgFCumnF_OCnxUNX1B1aS8,o75mP4hUfb8HanIlJzEwhFNnohZ8,o75mP4iDqQGyGxmy9xPUDQG4VXu0,o75mP4irtUmrnCCyFCnt_RlrCMsM,o75mP4qxxo9ItRsRq7mwOVX4xGS4,o75mP4g_avnBfmPHZFfvpbm4EaHQ,o75mP4hqwpAH0J6uFWowgRvzuhlc,o75mP4rrm_QLR81Shi3Ta6u8JQdw,o75mP4ng8GE8A0V33RP2KLtVdS_0,o75mP4rNerRlmSPhE9Riqy0zMal8,o75mP4vwXu1tdYmn7Zvyn4FNTLy0,o75mP4jdD1pYQ_vrizN9BaohH3GE,o75mP4sHN8Vf63Y6c4wxPPN5dLi8,o75mP4qACH51gjV3KRcXG7O-XYEQ,o75mP4jDiNuR_DkLbswMnexynvyQ,o75mP4tXjRp4rXu1mo0-OaspTYGE,o75mP4tLxiBdYkCSJ5Bc11MqBMzQ,o75mP4mBOzYG36GHXLizOVXrs_KQ,o75mP4ogqoPb342HvOWkqa1oG430,o75mP4oDkpt4WK3cz-w-zVbaLjpQ,o75mP4vy-V4gMDM7lGJ1LG4krOXM,o75mP4tS3DSL40k2azj1rL2LtKog,o75mP4sw1lseQE1QbLmo9w1QdrCg,o75mP4n6pYJnMfHH1oZLABJTGPkU,o75mP4lm5_KcgTsDgemxD99MZkJU,o75mP4i_Jw77mYu6TLrck5Vlyu3c,o75mP4vDmHl_uqgDNm0GEbuUl4yU,o75mP4ti4hUPzIT2l3nuWE5GCRTw,o75mP4qbwg-f7eFqnXcHQqIluYBY,o75mP4rTx_0qs0VddeMy1rdPNgZQ,o75mP4qsFcYRCvlFGqEeLzjDKTRw,o75mP4oWE46DkJGjyFifCHTau8XI,o75mP4pgmaoNwrFdlusCopUQ5Plg,o75mP4iW9b5h2tFPj3EV9QHqJdjA,o75mP4r1DO1Zs-xJ2El6EnATk2zU,o75mP4rqgpiDo38j3DAOXFBAR6MQ,o75mP4pcZFWImHVbxkY7-_MgB2Z0,o75mP4kUSLOLBlkca1qioI5sA4Ak,o75mP4gh9PQVggRq0nmYUkE39S4I,o75mP4mpbBCxryTs5L6CJSlscTx4,o75mP4rmLbfJu3AirLOyDutNKnLQ,o75mP4u60MFvqXPwkV8E7ZxBk90I,o75mP4gtLanRjIVji2o55mzNurGA,o75mP4u_QBMwvj-WKdzdz-9RDUpU,o75mP4lN6R-Nuq2Qc7q3TiHLulUU,o75mP4tF7Niy8solzv9QKdf6_ok4,o75mP4oS21avIuorAacR86qGcjk0,o75mP4mK0jX_6jJbkxb8NshopTPw,o75mP4lA8F3u3SHLI1_wtWAe4npQ,o75mP4pEYL7ErKKOfdSAeymNW-Hg,o75mP4oBxSKj3xI7Y3YhnMzeEdMI,o75mP4lAEsLjKvWe7Xg-nAEvhtkE,oUZP64jA28lzVkGpO8Dk3RGk1Sis,o75mP4ipoCIGZx39267rNs5vwNHU,o75mP4u3xzyMYjHvdDkOWoyWEOLc,o75mP4msZUq2JH4O7OC0UviAfw40,o75mP4iGgubSMH5SGXoTlDld0Yws,o75mP4iNV1fPq9oYmQInJb7pqc7I,o75mP4lt-qO6ho4gLPFOnrmwrQK4,o75mP4ujlfa9_dEA9vsMcSrwJHL4,o75mP4jyLvLnlK4V1tTle5c-XBZQ,o75mP4pb3PDGhOte0oGUSrg-MwdQ,o75mP4pgEWpxhENUfTGDpmB_CywA,o75mP4pB0Pg08Qm49tw_Bxv21SlM,o75mP4jBKnH0IZwSa_bTsqP9SHmg,o75mP4gytoFLx2SVyOYBC2q5b3Eo,o75mP4vKEGIhUAaXOjt2shSXJcDA,o75mP4gDX6NylUHlEk2ADhohda30,o75mP4gJuDXrMo-uSHL9fFqSmjHs,o75mP4p7Zu-sL3gNJyGA5clF6zFY,o75mP4lG_ZL3hLXOYbUWDn2KS0gA,o75mP4huAI3d-ppiFtXehaxRCxy4,o75mP4ooRFBeUoZRkTj0__g-Qy8M,o75mP4rFWDDTxASI0y2Yux-TigIE,o75mP4gY5hNCztAHHi4dqNxsJnhU,o75mP4tIb5xl_5cRPklK6kEnweF0,o75mP4qoO92I4EdPn9m-Z2zDzJRw,o75mP4hoTS6amBM3Eki-a8Irvwy8,o75mP4nnrFrlT9mvpF6496K9_jFE,o75mP4tuPhqu7XoF3lssLtyMzDZ4,o75mP4hicarL895Op3luBXofPrkg,o75mP4ji4or-Hh22Lomvv963GORw,o75mP4k8VwCKN2O_-_bdh-LDf_eo,o75mP4vGey_LGU3kefqgBJ42Yki8,o75mP4pOmEjdLF5fiviRqop2BH-M,o75mP4sgL8x07A6IwGJYkkq5zugE,o75mP4izt1GVZJvJ5Zk21hUgQEH4,o75mP4qEcZZypmJed4x1L68oGHkg,o75mP4nTrrHcHgBE_Mp6Ph80gEzM,o75mP4qDxHTr-WcMIDZUCZiKnP-I,o75mP4l7apfVSQSXGPc0Id6tuzCs,o75mP4ofTAieICeXtz8a3kHWZaBc,o75mP4juz4yFuBD0Y0OjZjq-DTd0,o75mP4ksZEGtUHHxvhpFOTi_TwrE,o75mP4i0aylgPuD62c0LsgwUUj3M,o75mP4jv6Xas9jIMzGhYgh1JSmUI,o75mP4vjSQv3goGlXa8LXDUE-h2k,o75mP4nEu4EKXvnJ1mx5_jsUqHqk,o75mP4qjM5DH9oAmuNN6F4jsG8eg,o75mP4qJS9YJrTFdPm2x6AELkAeU,o75mP4r0YcOxBjDRlYyXVvhkabMk,o75mP4l3IsNplOV_-1x4rvx15osE,o75mP4iyn7ILtPA2QkIv7OAMmYzU,o75mP4hseeUEu8w1euwJ9rudpLzI,o75mP4i1dFE8x4yVjAEruKugJdHI,o75mP4vc9w3dWAvIrqBfKIVCi-JI,o75mP4jF5uKyVq9x3FZrrHT4mNhM,o75mP4gHWHTG3V6jKWbf4VgnysNY,o75mP4rYFC_I_OtqPS4zvrPySiX4,o75mP4tHM1Wzx_iEzXy9BX2fDTTU,o75mP4vZ4L1AtYTRHMrwt7sKvkYI,o75mP4sgnmPqSuxzNlODh93bZoTY,o75mP4pSTCv4d1s1uAfkWXJw8XGc,o75mP4uhwbyjzJre0eyI3Vm2MoRE,o75mP4s0306KPyB9tnYs9AhNqBKo,o75mP4pMR7MTwktPgg-qBIOYB4lg,o75mP4ki0NIgEHuGYn75lx5pEhHM,o75mP4uBV9-Wd3rgta-KMOjvmtNM,o75mP4gKGrwvsvrl01p3DvrKke7E,o75mP4k2OLW6TQpnaKly-B1KQvpo,o75mP4iL1KY1F0X98LHXqhz67SJA,o75mP4mcK3XPZSvavVzk2jcoDXKA,o75mP4rc0NrGYOrfHx4RHD0SUp4o,o75mP4ul7DEiCBM6tLmn7FQ-evKs,o75mP4vlpgZ-5wovn4qZ28eObsw8,o75mP4v_RReu5Un0eMsuZ4rlD_HM,o75mP4rR1ZNTFjSlPMN5BdInTj5c,o75mP4t0USrJin9kG9qSiPzKra9M,o75mP4spGb_O99tPzjFP_ctF_UVM,o75mP4ssCWsW7fpnnVAy2NPW7cLI,o75mP4vFnvKHHgZbPCU-_m84zfWU,o75mP4mi5buFepKPiApoy2QOOPe4,o75mP4vamcX-RpjqsrONit7-sj3M,o75mP4q3MpJGnaOFEMtc6mXJ4clU,o75mP4gmQt0Xtw-rGp-YXzCMk-UM,o75mP4lxQlTTDWqq4cc2z5UybL2U,o75mP4vsnR7J-nLwxu4XUYfCYKe4,o75mP4mRau4i4K3EQa5jJQ5HExcw,o75mP4mXb99zYvh6jhkeGJ4xrO-o,o75mP4sbUxUEF8x13n2x0UlGbdws,o75mP4tDAhwLwH_tYrHVyJZp4XPI,o75mP4hyoA2Jull42xBtL4AsAV5E,o75mP4puJ-WqX5cR2X_mgUQgYkng,o75mP4oOAd5aukKQbRRH-3P2IANE,o75mP4gKhw1FCxFn5ZZ2jfMWXFsk,o75mP4gQQqwHp99xWxYvH_DwujXI,o75mP4klLpgapABQ7u6KYy0ceRgM,o75mP4ou7XfSmG-DOKJAEwjGJt68,o75mP4kq5aFF1ySSvOBitukkVZgU,o75mP4luqobDgF8KYf2HQAXfSMY4,o75mP4tqbbzDXaSpnJgHyXpV3SRc,o75mP4hBjmW1R0yRkg1tUGsPBYQ4,oUZP64gFahwEkWdh5Jijw2qeNysc,o75mP4oEJBvJtZpnlm2yjbNg1RYE,o75mP4h4EvJsIf-9B1p4csLDu0rs,o75mP4j0guSw4_t5gK5AVwYwy-CA,o75mP4pm6X3W-yjpOcKzj6NLI5CU,o75mP4jj0qc9hZ-lAkY4jKiLC628,o75mP4q7-Sy61vLnVpOi4dyNXo0M,o75mP4tQB5lE_jBGD6NISujDpsLg,o75mP4iJEB9Z_ggOJaPxxhUH2TTg,o75mP4u07K6yuGfdtRA_cw0tVOqU,o75mP4m_mhX6QRuOCjudfyfOcwGw,o75mP4sfz2gEFIwvEm-ncZKc6D7Q,o75mP4vqZkJoN1gw1vmru6ZUvN7w,o75mP4u68hngU2E8-D55QVd2Sydc,o75mP4jrtbRtz2u6WrvmTv8PNUHs,o75mP4n-9C2ISWYxP5UFPAmuVaSw,o75mP4vh63zCMK29hBMz1uj8IplU,o75mP4qFLVn-EVu7QlonA_92uBmU,o75mP4py1ZI_e3DOjG0nYJ89siUs,o75mP4s_cmtXKRe9St2AK_pbCtnM,o75mP4sC75DaywYpFaSEY6VTDP24,o75mP4r0383wuzZ2i9qKKUXg94jA,o75mP4gk-PFTDO-2px-IFpD6u4W0,o75mP4oifZAWbFJuKMK8d1muo0fA,o75mP4u_pBxPks1j_P7ykfsnHIRs,o75mP4sRSJ-CxadTiKieRlbIIZnc,o75mP4jBLQxA0QgyIeMMumgO2W4c,o75mP4ia4WlQ-7ZrvXpGVCXm50vk,o75mP4h3wDLNrhygaC4RFiHtCJ9U,o75mP4nrFRJR0QLNFheuOTB6rJz4,o75mP4vDXm8JlBhkA3rIKGgjRu3E,o75mP4m_s1MhITaRjX73-DsIQt_c,o75mP4kU0R4AdsaNNqg2vwlmk8WI,o75mP4nQ_dpkKx-3L7pYqlHT-Z1s,o75mP4gRrc2AcJeVeG0yUT39d7qU,o75mP4hkrm2JvaqSCCwgy8zIiQ3c,o75mP4uNG1z9jh2oY4teoe6kXcnE,o75mP4rRM-iok2ioJaZCmWTxO7yI,o75mP4toeNUSPJdTVPiImqxGBWCE,o75mP4lCXS_RVEdrc5vuDDLZxD5k,o75mP4o1O31gAe4DN63zd-BgYL3Q,o75mP4iMvT39-RFKLYrlhH_eO7V8,o75mP4hmZ7fxYYH97TC58RrEyV9k,o75mP4tYPw3_I2_hZ1UTf9YHMc80,o75mP4mIH-zg4C44GGojZ_zNb5hY,o75mP4nTVoY47oQdregYkM7L9SsQ,o75mP4sR3d4_mbPFb3kkX0Xo7s_k,o75mP4knDFZftiSJB6b6uZKMKlBk,o75mP4vWiqycHhuCI9nKmhTLhxFM,o75mP4jbpeXprT3GsM8tBe-zB3Ws,o75mP4pKsW86a8wjumSVySQ59LF8,o75mP4ltP87mWL6WwmFyutz6RNqM,o75mP4nUQcdu71eUEiQo_OIBK2VU,o75mP4jphQpvHP5bc3juKAgBN650,o75mP4t50UPqXdT1V7s3YPThmI8I,o75mP4tTQun5HFh0LqpDCPjcLQJU,o75mP4uv1Fp5sPfnlW4-qY2OyeZA,o75mP4tQagCP8yAtfZWnfVE7IgII,o75mP4roS2ibY4M8Ao5LBykotlDs,o75mP4gxmaGa9uvVL_q9EtH5UKbQ,o75mP4mSbGZkBY-9pkW-kuuya_lA,o75mP4oJH05GKqmLrC-YN0t6aMzE,o75mP4rnVZl1ju3pLDBFTtSstaHM,o75mP4rOqFKico2jIT_fpYYjw_Xs,o75mP4qh19tgsY4y6l5szvOmpuvk,o75mP4sQiG_pdOBDj8Dg6vRLdsno,o75mP4iHX5spvdYb-s__Kj6B5qTE,o75mP4uPUf3gqdI8pKCe8zkHez8M,o75mP4mJEqyzGwhFv4HlWILkHkz0,o75mP4laI7uS1Q2wbPNFRGx4Xz5c,o75mP4vLSIKTT8b1jqC6CXpKwvOk,o75mP4hAgbYTBmM8SHStB0ePAdcQ,o75mP4lpguBrL-ZqoTu1uXxvUltk,o75mP4mZha3WC8xYmQl7O9G9iGC4,o75mP4rj6Og2ry8qLlPbsro8wt9U,o75mP4hNSfuVBOKhrN8aog9ZKBaw,o75mP4gVuT0zAirhjC-dEmR9548M,o75mP4neviRRIimGFG5jfnohDnl8,o75mP4mvj1DOfxqKfNcEiCC5d24Y,o75mP4r-rq5xBkU_IAIT69j4cNzs,o75mP4uDrsC2VE70ed4T3y9u4qKY,o75mP4pAfApJomXeydxiPSOzdqiA,o75mP4hVFYCEvSeSEM08G_xrLqWs,o75mP4lSy0N4UqqwjMlUVX259h34,o75mP4uJPL9yJj6TrFTnEZRxwR2A,o75mP4lgLoEurvfRW9rZ9mboXZ94,o75mP4g7DFupCIrcx1h78IQT66Z0,o75mP4mYp5iI-8zCqpooV6lDZVho,o75mP4lN5d1vTOs7zQvglXpu4Enw,o75mP4pSUWDTqMoyumKA6PEqxx1o,o75mP4hM6SXKLCd81RpvTAIujeLM,o75mP4gozFZ9FF8-2AqsELruU43k,o75mP4sPjxIjXW8S9ehLUOSOpCdM,o75mP4qAKJlaTD6OIVO9tpHAmESk,o75mP4rBokVvqwZ4nxa27LSpIijM,o75mP4ggXnqApbfYuh2128rBL12w,o75mP4oSai8k-ILJx24tVPQY4IwA,o75mP4thPLcJdx0InE43ZnXBkDG4,o75mP4hcHJRcKVahGu7zqpMlq2NQ,o75mP4rbPVyAyYrHk2iX8ggI40H4,o75mP4kIsCALCAn50G2GqvdPeN_I,o75mP4sOr64aEnoaD2scr_LXA-M8,
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
     * tags : Wi-Fi,白板,茶歇,打印,纸笔,发票,投影仪,激光笔,转换器,多媒体屏,蓝牙音箱,电源插座,智能翻译,
     * content2 : null
     * remark :
     * lat : 32.041706411146
     * lng : 118.781764388
     * jw : 118.788211,32.047912
     * xingzhengqu : 秦淮区,
     * shangyequ : 新街口,
     * ditiexian : 1号线-新街口,2号线-新街口,
     * useoldposition : 10200
     * samepositioncount : 2
     * evaluate_photo : https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTIp74WkwE6OCkAbmjmoLfTN8TAsWibR8iakVB4NxUBsmnnicOTxabjqtLB6uWnfL5fr4FmNR5fIgo78g/132
     * evaluate_name : 匿名用户
     * evaluate_date : 2019-04-24
     * evaluate_score : 5
     * evaluate_content :
     * distance : 12678KM
     * commentcount : 4
     * othermeetings : [{"id":"10197","province":null,"city":"南京","area":null,"kind":"会议","title":"会议室A","content":"","mianji":"22m²","shop":"274","shopname":"爱米厅共享空间","create_time":"1536565205","update_time":"1559139153","hot":"9999","score":"5","tel":"17705151588","positionimage":"142915ba50e317c22a.png","youhuiquan":null,"openingdays":"周一,周二,周三,周四,周五,周六,周日","openingtime":"07:00-23:00","openingtimebegin":"07:00","openingtimeend":"23:00","address":"爱米厅共享空间-会议室A","status":"1","number":"12","fitnumber":"12","slogan":"智能 高效 便捷 私密","oldprice":"150.00","price":"99.00","a":null,"d":null,"p":null,"s":null,"f":null,"sell":"38","type":null,"goodstype":null,"goodstypewords":"商务会议,商务培训,文化交流,活动聚会,拍摄录制,亲子活动,","user":"管理员","special":"1、空间2小时起订","special1":"2小时","special2":"可以","special3":"不可以","special4":"可以","special5":"","special6":"","rule1":"2小时","rule2":"10%","rule3":"收取定金80%","image1":"82035bab77eda2ad0.jpg","image2":"120085bab77eda2c41.jpg","image3":"227855bab77eda2e3c.jpg","image4":"255105bab77eda2f5a.jpg","image5":"127755bab77eda30a5.jpg","image6":"208845bab77eda31bf.jpg","image7":"","image8":null,"image9":null,"image10":null,"image11":null,"image12":null,"image13":null,"image14":null,"image15":null,"image16":null,"image17":null,"image18":null,"image19":null,"image20":null,"click":"7502","oncount":"153","person":"1","openid":"o75mP4mU_oLHJRS1J_lykQI3Xk6g,o75mP4lerOlujHOzJV6WHgkx0NEY,o75mP4mv_8pbddIc0utXIUGuR_sQ,o75mP4t8Ux-mRZwSyfDXHvfg5VUo,o75mP4oE1mpktZVrEKN5jqgxP4Vs,null,o75mP4hQVV9WJV3RTFlct5Xw_vzU,o75mP4u8OAZ4c4h8nvyEncTK3wL0,o75mP4iLJPmEosUjdBi6c0xLMpdg,o75mP4lPsDpKRn3kFKztRCJmOuTQ,o75mP4iTyr5HoXYOtkHYFLkm6wW0,undefined,o75mP4otXs3_Sp215_bCuHuG0A0o,o75mP4qzsvzQ8GSv4NypuKHcIoHc,o75mP4lpXCjc0qhOVMdp5HCNiWc4,o75mP4mQrj-OoupSWz85nnXgWm4s,oUZP64uJEU_BXkrSfMSZmsTV5hJQ,o75mP4q3e9ThsoyIqv4PGTwzy_nk,o75mP4gx1LSK-MCOV-_d6OnnFC84,oUZP64kmmUmuYR_GMROdXHdMSWZ4,o75mP4rhV0QVHPeMD2bWFLNM0hRI,o75mP4ludRpTwgluErglu2gaaVrw,o75mP4tZRSIk6SsbdD0-LTACMAD0,o75mP4iiF6UxafhcMJ3ubEU0yNFU,o75mP4uwqTo6Gnz0BoVkKpI10BYM,o75mP4kKasvKivmlIb73ifnXPNFI,o75mP4jlIuEXojPfZRMpZcrIuSPk,o75mP4mMj1iRmiu6u-bP6S3A2mYM,oUZP64vtvVTAAql8mJs75uLGR6JE,o75mP4qVImWdEQL8DOzQXtrF-T6w,o75mP4jX_SQmhw-oF1oiCN9YwOvc,o75mP4pPbB9FOj1Q2djwn-WfJCIc,o75mP4iQ308Cph2tunISjBPEJrnM,o75mP4qGovXbHODcWbMwlTLsKXxg,o75mP4iZPGTWPTNJNa1kPk7cvxZM,o75mP4sCUsWUM7EqKynkaq_maaR4,o75mP4n_Ybtj5EilEzzPnkf_pgFk,o75mP4rjHZJMr08ptyGHHjNNBWJw,o75mP4tiNUzoSmWp6yzuCouhy_I4,o75mP4vxHfn7KhFXaValjqYdB3GQ,o75mP4iQXa67Y4WAQnzyQ6ztsBjM,o75mP4mIwpispcdeLC_ChIL-VXB4,o75mP4p6mzx9gyTBCQVEMhx2l808,o75mP4rSwDzu8ArjdtM_hLqHKHXk,o75mP4rrnk6P3VwLKqk_CE-1oJKE,o75mP4hgFCumnF_OCnxUNX1B1aS8,o75mP4hUfb8HanIlJzEwhFNnohZ8,o75mP4iDqQGyGxmy9xPUDQG4VXu0,o75mP4irtUmrnCCyFCnt_RlrCMsM,o75mP4qxxo9ItRsRq7mwOVX4xGS4,o75mP4g_avnBfmPHZFfvpbm4EaHQ,o75mP4hqwpAH0J6uFWowgRvzuhlc,o75mP4rrm_QLR81Shi3Ta6u8JQdw,o75mP4ng8GE8A0V33RP2KLtVdS_0,o75mP4rNerRlmSPhE9Riqy0zMal8,o75mP4vwXu1tdYmn7Zvyn4FNTLy0,o75mP4jdD1pYQ_vrizN9BaohH3GE,o75mP4sHN8Vf63Y6c4wxPPN5dLi8,o75mP4qACH51gjV3KRcXG7O-XYEQ,o75mP4jDiNuR_DkLbswMnexynvyQ,o75mP4tXjRp4rXu1mo0-OaspTYGE,o75mP4tLxiBdYkCSJ5Bc11MqBMzQ,o75mP4mBOzYG36GHXLizOVXrs_KQ,o75mP4ogqoPb342HvOWkqa1oG430,o75mP4oDkpt4WK3cz-w-zVbaLjpQ,o75mP4vy-V4gMDM7lGJ1LG4krOXM,o75mP4tS3DSL40k2azj1rL2LtKog,o75mP4sw1lseQE1QbLmo9w1QdrCg,o75mP4n6pYJnMfHH1oZLABJTGPkU,o75mP4lm5_KcgTsDgemxD99MZkJU,o75mP4i_Jw77mYu6TLrck5Vlyu3c,o75mP4vDmHl_uqgDNm0GEbuUl4yU,o75mP4ti4hUPzIT2l3nuWE5GCRTw,o75mP4qbwg-f7eFqnXcHQqIluYBY,o75mP4rTx_0qs0VddeMy1rdPNgZQ,o75mP4qsFcYRCvlFGqEeLzjDKTRw,o75mP4oWE46DkJGjyFifCHTau8XI,o75mP4pgmaoNwrFdlusCopUQ5Plg,o75mP4iW9b5h2tFPj3EV9QHqJdjA,o75mP4r1DO1Zs-xJ2El6EnATk2zU,o75mP4rqgpiDo38j3DAOXFBAR6MQ,o75mP4pcZFWImHVbxkY7-_MgB2Z0,o75mP4kUSLOLBlkca1qioI5sA4Ak,o75mP4gh9PQVggRq0nmYUkE39S4I,o75mP4mpbBCxryTs5L6CJSlscTx4,o75mP4rmLbfJu3AirLOyDutNKnLQ,o75mP4u60MFvqXPwkV8E7ZxBk90I,o75mP4gtLanRjIVji2o55mzNurGA,o75mP4u_QBMwvj-WKdzdz-9RDUpU,o75mP4lN6R-Nuq2Qc7q3TiHLulUU,o75mP4tF7Niy8solzv9QKdf6_ok4,o75mP4oS21avIuorAacR86qGcjk0,o75mP4mK0jX_6jJbkxb8NshopTPw,o75mP4lA8F3u3SHLI1_wtWAe4npQ,o75mP4pEYL7ErKKOfdSAeymNW-Hg,o75mP4oBxSKj3xI7Y3YhnMzeEdMI,o75mP4lAEsLjKvWe7Xg-nAEvhtkE,oUZP64jA28lzVkGpO8Dk3RGk1Sis,o75mP4ipoCIGZx39267rNs5vwNHU,o75mP4u3xzyMYjHvdDkOWoyWEOLc,o75mP4msZUq2JH4O7OC0UviAfw40,o75mP4iGgubSMH5SGXoTlDld0Yws,o75mP4iNV1fPq9oYmQInJb7pqc7I,o75mP4lt-qO6ho4gLPFOnrmwrQK4,o75mP4ujlfa9_dEA9vsMcSrwJHL4,o75mP4jyLvLnlK4V1tTle5c-XBZQ,o75mP4pb3PDGhOte0oGUSrg-MwdQ,o75mP4pgEWpxhENUfTGDpmB_CywA,o75mP4pB0Pg08Qm49tw_Bxv21SlM,o75mP4jBKnH0IZwSa_bTsqP9SHmg,o75mP4gytoFLx2SVyOYBC2q5b3Eo,o75mP4vKEGIhUAaXOjt2shSXJcDA,o75mP4gDX6NylUHlEk2ADhohda30,o75mP4gJuDXrMo-uSHL9fFqSmjHs,o75mP4p7Zu-sL3gNJyGA5clF6zFY,o75mP4lG_ZL3hLXOYbUWDn2KS0gA,o75mP4huAI3d-ppiFtXehaxRCxy4,o75mP4ooRFBeUoZRkTj0__g-Qy8M,o75mP4rFWDDTxASI0y2Yux-TigIE,o75mP4gY5hNCztAHHi4dqNxsJnhU,o75mP4tIb5xl_5cRPklK6kEnweF0,o75mP4qoO92I4EdPn9m-Z2zDzJRw,o75mP4hoTS6amBM3Eki-a8Irvwy8,o75mP4nnrFrlT9mvpF6496K9_jFE,o75mP4tuPhqu7XoF3lssLtyMzDZ4,o75mP4hicarL895Op3luBXofPrkg,o75mP4ji4or-Hh22Lomvv963GORw,o75mP4k8VwCKN2O_-_bdh-LDf_eo,o75mP4vGey_LGU3kefqgBJ42Yki8,o75mP4pOmEjdLF5fiviRqop2BH-M,o75mP4sgL8x07A6IwGJYkkq5zugE,o75mP4izt1GVZJvJ5Zk21hUgQEH4,o75mP4qEcZZypmJed4x1L68oGHkg,o75mP4nTrrHcHgBE_Mp6Ph80gEzM,o75mP4qDxHTr-WcMIDZUCZiKnP-I,o75mP4l7apfVSQSXGPc0Id6tuzCs,o75mP4ofTAieICeXtz8a3kHWZaBc,o75mP4juz4yFuBD0Y0OjZjq-DTd0,o75mP4ksZEGtUHHxvhpFOTi_TwrE,o75mP4i0aylgPuD62c0LsgwUUj3M,o75mP4jv6Xas9jIMzGhYgh1JSmUI,o75mP4vjSQv3goGlXa8LXDUE-h2k,o75mP4nEu4EKXvnJ1mx5_jsUqHqk,o75mP4qjM5DH9oAmuNN6F4jsG8eg,o75mP4qJS9YJrTFdPm2x6AELkAeU,o75mP4r0YcOxBjDRlYyXVvhkabMk,o75mP4l3IsNplOV_-1x4rvx15osE,o75mP4iyn7ILtPA2QkIv7OAMmYzU,o75mP4hseeUEu8w1euwJ9rudpLzI,o75mP4i1dFE8x4yVjAEruKugJdHI,o75mP4vc9w3dWAvIrqBfKIVCi-JI,o75mP4jF5uKyVq9x3FZrrHT4mNhM,o75mP4gHWHTG3V6jKWbf4VgnysNY,o75mP4rYFC_I_OtqPS4zvrPySiX4,o75mP4tHM1Wzx_iEzXy9BX2fDTTU,o75mP4vZ4L1AtYTRHMrwt7sKvkYI,o75mP4sgnmPqSuxzNlODh93bZoTY,o75mP4pSTCv4d1s1uAfkWXJw8XGc,o75mP4uhwbyjzJre0eyI3Vm2MoRE,o75mP4s0306KPyB9tnYs9AhNqBKo,o75mP4pMR7MTwktPgg-qBIOYB4lg,o75mP4ki0NIgEHuGYn75lx5pEhHM,o75mP4uBV9-Wd3rgta-KMOjvmtNM,o75mP4gKGrwvsvrl01p3DvrKke7E,o75mP4k2OLW6TQpnaKly-B1KQvpo,o75mP4iL1KY1F0X98LHXqhz67SJA,o75mP4mcK3XPZSvavVzk2jcoDXKA,o75mP4rc0NrGYOrfHx4RHD0SUp4o,o75mP4ul7DEiCBM6tLmn7FQ-evKs,o75mP4vlpgZ-5wovn4qZ28eObsw8,o75mP4v_RReu5Un0eMsuZ4rlD_HM,o75mP4rR1ZNTFjSlPMN5BdInTj5c,o75mP4t0USrJin9kG9qSiPzKra9M,o75mP4spGb_O99tPzjFP_ctF_UVM,o75mP4ssCWsW7fpnnVAy2NPW7cLI,o75mP4vFnvKHHgZbPCU-_m84zfWU,o75mP4mi5buFepKPiApoy2QOOPe4,o75mP4vamcX-RpjqsrONit7-sj3M,o75mP4q3MpJGnaOFEMtc6mXJ4clU,o75mP4gmQt0Xtw-rGp-YXzCMk-UM,o75mP4lxQlTTDWqq4cc2z5UybL2U,o75mP4vsnR7J-nLwxu4XUYfCYKe4,o75mP4mRau4i4K3EQa5jJQ5HExcw,o75mP4mXb99zYvh6jhkeGJ4xrO-o,o75mP4sbUxUEF8x13n2x0UlGbdws,o75mP4tDAhwLwH_tYrHVyJZp4XPI,o75mP4hyoA2Jull42xBtL4AsAV5E,o75mP4puJ-WqX5cR2X_mgUQgYkng,o75mP4oOAd5aukKQbRRH-3P2IANE,o75mP4gKhw1FCxFn5ZZ2jfMWXFsk,o75mP4gQQqwHp99xWxYvH_DwujXI,o75mP4klLpgapABQ7u6KYy0ceRgM,o75mP4ou7XfSmG-DOKJAEwjGJt68,o75mP4kq5aFF1ySSvOBitukkVZgU,o75mP4luqobDgF8KYf2HQAXfSMY4,o75mP4tqbbzDXaSpnJgHyXpV3SRc,o75mP4hBjmW1R0yRkg1tUGsPBYQ4,oUZP64gFahwEkWdh5Jijw2qeNysc,o75mP4oEJBvJtZpnlm2yjbNg1RYE,o75mP4h4EvJsIf-9B1p4csLDu0rs,o75mP4j0guSw4_t5gK5AVwYwy-CA,o75mP4pm6X3W-yjpOcKzj6NLI5CU,o75mP4jj0qc9hZ-lAkY4jKiLC628,o75mP4q7-Sy61vLnVpOi4dyNXo0M,o75mP4tQB5lE_jBGD6NISujDpsLg,o75mP4iJEB9Z_ggOJaPxxhUH2TTg,o75mP4u07K6yuGfdtRA_cw0tVOqU,o75mP4m_mhX6QRuOCjudfyfOcwGw,o75mP4sfz2gEFIwvEm-ncZKc6D7Q,o75mP4vqZkJoN1gw1vmru6ZUvN7w,o75mP4u68hngU2E8-D55QVd2Sydc,o75mP4jrtbRtz2u6WrvmTv8PNUHs,o75mP4n-9C2ISWYxP5UFPAmuVaSw,o75mP4vh63zCMK29hBMz1uj8IplU,o75mP4qFLVn-EVu7QlonA_92uBmU,o75mP4py1ZI_e3DOjG0nYJ89siUs,o75mP4s_cmtXKRe9St2AK_pbCtnM,o75mP4sC75DaywYpFaSEY6VTDP24,o75mP4r0383wuzZ2i9qKKUXg94jA,o75mP4gk-PFTDO-2px-IFpD6u4W0,o75mP4oifZAWbFJuKMK8d1muo0fA,o75mP4u_pBxPks1j_P7ykfsnHIRs,o75mP4sRSJ-CxadTiKieRlbIIZnc,o75mP4jBLQxA0QgyIeMMumgO2W4c,o75mP4ia4WlQ-7ZrvXpGVCXm50vk,o75mP4h3wDLNrhygaC4RFiHtCJ9U,o75mP4nrFRJR0QLNFheuOTB6rJz4,o75mP4vDXm8JlBhkA3rIKGgjRu3E,o75mP4m_s1MhITaRjX73-DsIQt_c,o75mP4kU0R4AdsaNNqg2vwlmk8WI,o75mP4nQ_dpkKx-3L7pYqlHT-Z1s,o75mP4gRrc2AcJeVeG0yUT39d7qU,o75mP4hkrm2JvaqSCCwgy8zIiQ3c,o75mP4uNG1z9jh2oY4teoe6kXcnE,o75mP4rRM-iok2ioJaZCmWTxO7yI,o75mP4toeNUSPJdTVPiImqxGBWCE,o75mP4lCXS_RVEdrc5vuDDLZxD5k,o75mP4o1O31gAe4DN63zd-BgYL3Q,o75mP4iMvT39-RFKLYrlhH_eO7V8,o75mP4hmZ7fxYYH97TC58RrEyV9k,o75mP4tYPw3_I2_hZ1UTf9YHMc80,o75mP4mIH-zg4C44GGojZ_zNb5hY,o75mP4nTVoY47oQdregYkM7L9SsQ,o75mP4sR3d4_mbPFb3kkX0Xo7s_k,o75mP4knDFZftiSJB6b6uZKMKlBk,o75mP4vWiqycHhuCI9nKmhTLhxFM,o75mP4jbpeXprT3GsM8tBe-zB3Ws,o75mP4pKsW86a8wjumSVySQ59LF8,o75mP4ltP87mWL6WwmFyutz6RNqM,o75mP4nUQcdu71eUEiQo_OIBK2VU,o75mP4jphQpvHP5bc3juKAgBN650,o75mP4t50UPqXdT1V7s3YPThmI8I,o75mP4tTQun5HFh0LqpDCPjcLQJU,o75mP4uv1Fp5sPfnlW4-qY2OyeZA,o75mP4tQagCP8yAtfZWnfVE7IgII,o75mP4roS2ibY4M8Ao5LBykotlDs,o75mP4gxmaGa9uvVL_q9EtH5UKbQ,o75mP4mSbGZkBY-9pkW-kuuya_lA,o75mP4oJH05GKqmLrC-YN0t6aMzE,o75mP4rnVZl1ju3pLDBFTtSstaHM,o75mP4rOqFKico2jIT_fpYYjw_Xs,o75mP4qh19tgsY4y6l5szvOmpuvk,o75mP4sQiG_pdOBDj8Dg6vRLdsno,o75mP4iHX5spvdYb-s__Kj6B5qTE,o75mP4uPUf3gqdI8pKCe8zkHez8M,o75mP4mJEqyzGwhFv4HlWILkHkz0,o75mP4laI7uS1Q2wbPNFRGx4Xz5c,o75mP4vLSIKTT8b1jqC6CXpKwvOk,o75mP4hAgbYTBmM8SHStB0ePAdcQ,o75mP4lpguBrL-ZqoTu1uXxvUltk,o75mP4mZha3WC8xYmQl7O9G9iGC4,o75mP4rj6Og2ry8qLlPbsro8wt9U,o75mP4hNSfuVBOKhrN8aog9ZKBaw,o75mP4gVuT0zAirhjC-dEmR9548M,o75mP4neviRRIimGFG5jfnohDnl8,o75mP4mvj1DOfxqKfNcEiCC5d24Y,o75mP4r-rq5xBkU_IAIT69j4cNzs,o75mP4uDrsC2VE70ed4T3y9u4qKY,o75mP4pAfApJomXeydxiPSOzdqiA,o75mP4hVFYCEvSeSEM08G_xrLqWs,o75mP4lSy0N4UqqwjMlUVX259h34,o75mP4uJPL9yJj6TrFTnEZRxwR2A,o75mP4lgLoEurvfRW9rZ9mboXZ94,o75mP4g7DFupCIrcx1h78IQT66Z0,o75mP4mYp5iI-8zCqpooV6lDZVho,o75mP4lN5d1vTOs7zQvglXpu4Enw,o75mP4pSUWDTqMoyumKA6PEqxx1o,o75mP4hM6SXKLCd81RpvTAIujeLM,o75mP4gozFZ9FF8-2AqsELruU43k,o75mP4sPjxIjXW8S9ehLUOSOpCdM,o75mP4qAKJlaTD6OIVO9tpHAmESk,o75mP4rBokVvqwZ4nxa27LSpIijM,o75mP4ggXnqApbfYuh2128rBL12w,o75mP4oSai8k-ILJx24tVPQY4IwA,o75mP4thPLcJdx0InE43ZnXBkDG4,o75mP4hcHJRcKVahGu7zqpMlq2NQ,o75mP4rbPVyAyYrHk2iX8ggI40H4,o75mP4kIsCALCAn50G2GqvdPeN_I,o75mP4sOr64aEnoaD2scr_LXA-M8,","recommend":"严选,特惠,热门","yajin":null,"homerecommend":"首页推荐","bq1":null,"bq2":null,"bq3":null,"bq4":null,"bq5":null,"bq6":null,"press":null,"ystatus":"0","youji":null,"author":null,"weizhi":null,"source":"1","tags":"Wi-Fi,白板,茶歇,打印,纸笔,发票,投影仪,激光笔,转换器,多媒体屏,蓝牙音箱,电源插座,智能翻译,","content2":null,"remark":"","lat":"32.047912","lng":"118.788211","jw":"118.788211,32.047912","xingzhengqu":"秦淮区,","shangyequ":"新街口,","ditiexian":"1号线-新街口,2号线-新街口,","useoldposition":"10200","samepositioncount":"2","image":"https://imeeting.jiuze9.com/imeeting_new/Public/Uploads/82035bab77eda2ad0.jpg","commentcount":"4"},{"id":"10200","province":null,"city":"南京","area":null,"kind":"会议","title":"会议室B","content":"","mianji":"20m²","shop":"274","shopname":"爱米厅共享空间","create_time":"1536893528","update_time":"1557400249","hot":"9991","score":"5","tel":"17705151588","positionimage":"142915ba50e317c22a.png","youhuiquan":null,"openingdays":"周一,周二,周三,周四,周五,周六,周日","openingtime":"07:00-23:00","openingtimebegin":"07:00","openingtimeend":"23:00","address":"爱米厅共享空间-会议室B","status":"1","number":"12","fitnumber":"10","slogan":"智能 高效 便捷 私密","oldprice":"150.00","price":"99.00","a":null,"d":null,"p":null,"s":null,"f":null,"sell":"15","type":null,"goodstype":null,"goodstypewords":"商务会议,商务培训,文化交流,活动聚会,拍摄录制,亲子活动,","user":"管理员","special":"1、空间2小时起订","special1":"2小时","special2":"不可以","special3":"不可以","special4":"可以","special5":"","special6":"","rule1":"4小时","rule2":"20%","rule3":"收取定金10%","image1":"253055bab78851fd91.jpg","image2":"257585bab78851fee4.jpg","image3":"111355bab788520008.jpg","image4":"264445bab788520130.jpg","image5":"213975bab788520288.jpg","image6":"114345bab7885203b1.jpg","image7":"1555bab7885204c1.jpg","image8":"113205bab7885205fc.jpg","image9":"","image10":null,"image11":null,"image12":null,"image13":null,"image14":null,"image15":null,"image16":null,"image17":null,"image18":null,"image19":null,"image20":null,"click":"605","oncount":"52","person":"1","openid":"o75mP4mU_oLHJRS1J_lykQI3Xk6g,o75mP4t8Ux-mRZwSyfDXHvfg5VUo,o75mP4mv_8pbddIc0utXIUGuR_sQ,o75mP4lerOlujHOzJV6WHgkx0NEY,o75mP4u8OAZ4c4h8nvyEncTK3wL0,o75mP4qzsvzQ8GSv4NypuKHcIoHc,o75mP4iTyr5HoXYOtkHYFLkm6wW0,o75mP4lpXCjc0qhOVMdp5HCNiWc4,o75mP4mQrj-OoupSWz85nnXgWm4s,o75mP4lPsDpKRn3kFKztRCJmOuTQ,o75mP4otXs3_Sp215_bCuHuG0A0o,o75mP4oE1mpktZVrEKN5jqgxP4Vs,oUZP64uJEU_BXkrSfMSZmsTV5hJQ,null,oUZP64oPCEF_78pD2y8rKvxPOOFk,o75mP4gx1LSK-MCOV-_d6OnnFC84,o75mP4nKnFFhrrFxQDdDMOEqVzmk,o75mP4g_avnBfmPHZFfvpbm4EaHQ,o75mP4mXiu4ZPVjjoGO00AZ48a4o,o75mP4qVImWdEQL8DOzQXtrF-T6w,o75mP4pPbB9FOj1Q2djwn-WfJCIc,o75mP4sFCVMgOcxRm7gK8FTa_A6Y,o75mP4tEgfOk8qgtxGP912VMPLk0,o75mP4tuPhqu7XoF3lssLtyMzDZ4,o75mP4mMj1iRmiu6u-bP6S3A2mYM,o75mP4iZPGTWPTNJNa1kPk7cvxZM,o75mP4n_Ybtj5EilEzzPnkf_pgFk,o75mP4iQXa67Y4WAQnzyQ6ztsBjM,o75mP4tPvL5oBMD04N5pQ5d_WyLQ,o75mP4i7z_7EgAQxm3HvdlOcb0Fs,o75mP4m-KJNRYnnyuTz0K4JR8AgI,o75mP4rSwDzu8ArjdtM_hLqHKHXk,o75mP4rrnk6P3VwLKqk_CE-1oJKE,o75mP4iDqQGyGxmy9xPUDQG4VXu0,o75mP4mHnutfe73hfyjyn0Ew42Vs,o75mP4vwXu1tdYmn7Zvyn4FNTLy0,o75mP4gMh3aMAQMz1ACetvqFURoI,o75mP4ng8GE8A0V33RP2KLtVdS_0,o75mP4sw1lseQE1QbLmo9w1QdrCg,o75mP4r4wnL65hhia9TGvUxmL9sw,o75mP4nHMovfnEDpeQZIbpOlCF4M,o75mP4oWE46DkJGjyFifCHTau8XI,o75mP4qsFcYRCvlFGqEeLzjDKTRw,o75mP4l7apfVSQSXGPc0Id6tuzCs,o75mP4r1DO1Zs-xJ2El6EnATk2zU,o75mP4i_Jw77mYu6TLrck5Vlyu3c,o75mP4oDkpt4WK3cz-w-zVbaLjpQ,o75mP4mK0jX_6jJbkxb8NshopTPw,o75mP4oS21avIuorAacR86qGcjk0,o75mP4tF7Niy8solzv9QKdf6_ok4,o75mP4gtLanRjIVji2o55mzNurGA,o75mP4rwp6moN10kjfrYfdN23kKI,o75mP4gytoFLx2SVyOYBC2q5b3Eo,o75mP4nxiM_7UJsjT_MLPrAwG0uk,o75mP4gJuDXrMo-uSHL9fFqSmjHs,o75mP4kUSLOLBlkca1qioI5sA4Ak,o75mP4tS3DSL40k2azj1rL2LtKog,o75mP4gDX6NylUHlEk2ADhohda30,o75mP4pB0Pg08Qm49tw_Bxv21SlM,o75mP4sgL8x07A6IwGJYkkq5zugE,o75mP4jBKnH0IZwSa_bTsqP9SHmg,o75mP4i0aylgPuD62c0LsgwUUj3M,o75mP4iW9b5h2tFPj3EV9QHqJdjA,o75mP4ksZEGtUHHxvhpFOTi_TwrE,o75mP4iQ308Cph2tunISjBPEJrnM,o75mP4hyoA2Jull42xBtL4AsAV5E,o75mP4gQQqwHp99xWxYvH_DwujXI,o75mP4ruJ83ydB_zcFvHnJtk1rzY,o75mP4vFnvKHHgZbPCU-_m84zfWU,o75mP4h4EvJsIf-9B1p4csLDu0rs,o75mP4ju59dK0_9_nhnZq3kEFPbM,o75mP4puJ-WqX5cR2X_mgUQgYkng,o75mP4vqZkJoN1gw1vmru6ZUvN7w,o75mP4tHM1Wzx_iEzXy9BX2fDTTU,o75mP4oifZAWbFJuKMK8d1muo0fA,oUZP64vtvVTAAql8mJs75uLGR6JE,o75mP4nQ_dpkKx-3L7pYqlHT-Z1s,o75mP4iMvT39-RFKLYrlhH_eO7V8,o75mP4knDFZftiSJB6b6uZKMKlBk,o75mP4k4C-9JSVYqWQGDFbbiL_Os,o75mP4vZ4L1AtYTRHMrwt7sKvkYI,o75mP4t50UPqXdT1V7s3YPThmI8I,o75mP4sI3fvQWoFnyioH21AQYLE0,o75mP4oFQIdiiw9HGVB4nWpeRUg4,o75mP4qh19tgsY4y6l5szvOmpuvk,o75mP4nTVoY47oQdregYkM7L9SsQ,oUZP64kmmUmuYR_GMROdXHdMSWZ4,o75mP4qpXzeTKHyvD0VWX720Q11g,","recommend":"严选,特惠,热门","yajin":null,"homerecommend":"","bq1":null,"bq2":null,"bq3":null,"bq4":null,"bq5":null,"bq6":null,"press":null,"ystatus":"0","youji":null,"author":null,"weizhi":null,"source":"1","tags":"Wi-Fi,白板,茶歇,打印,纸笔,发票,投影仪,激光笔,转换器,多媒体屏,蓝牙音箱,电源插座,智能翻译,","content2":null,"remark":"","lat":"32.047912","lng":"118.788211","jw":"118.788211,32.047912","xingzhengqu":"秦淮区,","shangyequ":"新街口,","ditiexian":"1号线-新街口,2号线-新街口,","useoldposition":"10197","samepositioncount":"2","image":"https://imeeting.jiuze9.com/imeeting_new/Public/Uploads/253055bab78851fd91.jpg","commentcount":"0"}]
     * fav : 0
     * tax : 1
     * result : success
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
    private double lat;
    private double lng;
    private String jw;
    private String xingzhengqu;
    private String shangyequ;
    private String ditiexian;
    private String useoldposition;
    private String samepositioncount;
    private String evaluate_photo;
    private String evaluate_name;
    private String evaluate_date;
    private String evaluate_score;
    private String evaluate_content;
    private String distance;
    private String commentcount;
    private String fav;
    private String tax;
    private String result;
    private List<OthermeetingsBean> othermeetings;

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

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
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

    public String getEvaluate_photo() {
        return evaluate_photo;
    }

    public void setEvaluate_photo(String evaluate_photo) {
        this.evaluate_photo = evaluate_photo;
    }

    public String getEvaluate_name() {
        return evaluate_name;
    }

    public void setEvaluate_name(String evaluate_name) {
        this.evaluate_name = evaluate_name;
    }

    public String getEvaluate_date() {
        return evaluate_date;
    }

    public void setEvaluate_date(String evaluate_date) {
        this.evaluate_date = evaluate_date;
    }

    public String getEvaluate_score() {
        return evaluate_score;
    }

    public void setEvaluate_score(String evaluate_score) {
        this.evaluate_score = evaluate_score;
    }

    public String getEvaluate_content() {
        return evaluate_content;
    }

    public void setEvaluate_content(String evaluate_content) {
        this.evaluate_content = evaluate_content;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(String commentcount) {
        this.commentcount = commentcount;
    }

    public String getFav() {
        return fav;
    }

    public void setFav(String fav) {
        this.fav = fav;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<OthermeetingsBean> getOthermeetings() {
        return othermeetings;
    }

    public void setOthermeetings(List<OthermeetingsBean> othermeetings) {
        this.othermeetings = othermeetings;
    }

    public static class OthermeetingsBean {
        /**
         * id : 10197
         * province : null
         * city : 南京
         * area : null
         * kind : 会议
         * title : 会议室A
         * content :
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
         * address : 爱米厅共享空间-会议室A
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
         * click : 7502
         * oncount : 153
         * person : 1
         * openid : o75mP4mU_oLHJRS1J_lykQI3Xk6g,o75mP4lerOlujHOzJV6WHgkx0NEY,o75mP4mv_8pbddIc0utXIUGuR_sQ,o75mP4t8Ux-mRZwSyfDXHvfg5VUo,o75mP4oE1mpktZVrEKN5jqgxP4Vs,null,o75mP4hQVV9WJV3RTFlct5Xw_vzU,o75mP4u8OAZ4c4h8nvyEncTK3wL0,o75mP4iLJPmEosUjdBi6c0xLMpdg,o75mP4lPsDpKRn3kFKztRCJmOuTQ,o75mP4iTyr5HoXYOtkHYFLkm6wW0,undefined,o75mP4otXs3_Sp215_bCuHuG0A0o,o75mP4qzsvzQ8GSv4NypuKHcIoHc,o75mP4lpXCjc0qhOVMdp5HCNiWc4,o75mP4mQrj-OoupSWz85nnXgWm4s,oUZP64uJEU_BXkrSfMSZmsTV5hJQ,o75mP4q3e9ThsoyIqv4PGTwzy_nk,o75mP4gx1LSK-MCOV-_d6OnnFC84,oUZP64kmmUmuYR_GMROdXHdMSWZ4,o75mP4rhV0QVHPeMD2bWFLNM0hRI,o75mP4ludRpTwgluErglu2gaaVrw,o75mP4tZRSIk6SsbdD0-LTACMAD0,o75mP4iiF6UxafhcMJ3ubEU0yNFU,o75mP4uwqTo6Gnz0BoVkKpI10BYM,o75mP4kKasvKivmlIb73ifnXPNFI,o75mP4jlIuEXojPfZRMpZcrIuSPk,o75mP4mMj1iRmiu6u-bP6S3A2mYM,oUZP64vtvVTAAql8mJs75uLGR6JE,o75mP4qVImWdEQL8DOzQXtrF-T6w,o75mP4jX_SQmhw-oF1oiCN9YwOvc,o75mP4pPbB9FOj1Q2djwn-WfJCIc,o75mP4iQ308Cph2tunISjBPEJrnM,o75mP4qGovXbHODcWbMwlTLsKXxg,o75mP4iZPGTWPTNJNa1kPk7cvxZM,o75mP4sCUsWUM7EqKynkaq_maaR4,o75mP4n_Ybtj5EilEzzPnkf_pgFk,o75mP4rjHZJMr08ptyGHHjNNBWJw,o75mP4tiNUzoSmWp6yzuCouhy_I4,o75mP4vxHfn7KhFXaValjqYdB3GQ,o75mP4iQXa67Y4WAQnzyQ6ztsBjM,o75mP4mIwpispcdeLC_ChIL-VXB4,o75mP4p6mzx9gyTBCQVEMhx2l808,o75mP4rSwDzu8ArjdtM_hLqHKHXk,o75mP4rrnk6P3VwLKqk_CE-1oJKE,o75mP4hgFCumnF_OCnxUNX1B1aS8,o75mP4hUfb8HanIlJzEwhFNnohZ8,o75mP4iDqQGyGxmy9xPUDQG4VXu0,o75mP4irtUmrnCCyFCnt_RlrCMsM,o75mP4qxxo9ItRsRq7mwOVX4xGS4,o75mP4g_avnBfmPHZFfvpbm4EaHQ,o75mP4hqwpAH0J6uFWowgRvzuhlc,o75mP4rrm_QLR81Shi3Ta6u8JQdw,o75mP4ng8GE8A0V33RP2KLtVdS_0,o75mP4rNerRlmSPhE9Riqy0zMal8,o75mP4vwXu1tdYmn7Zvyn4FNTLy0,o75mP4jdD1pYQ_vrizN9BaohH3GE,o75mP4sHN8Vf63Y6c4wxPPN5dLi8,o75mP4qACH51gjV3KRcXG7O-XYEQ,o75mP4jDiNuR_DkLbswMnexynvyQ,o75mP4tXjRp4rXu1mo0-OaspTYGE,o75mP4tLxiBdYkCSJ5Bc11MqBMzQ,o75mP4mBOzYG36GHXLizOVXrs_KQ,o75mP4ogqoPb342HvOWkqa1oG430,o75mP4oDkpt4WK3cz-w-zVbaLjpQ,o75mP4vy-V4gMDM7lGJ1LG4krOXM,o75mP4tS3DSL40k2azj1rL2LtKog,o75mP4sw1lseQE1QbLmo9w1QdrCg,o75mP4n6pYJnMfHH1oZLABJTGPkU,o75mP4lm5_KcgTsDgemxD99MZkJU,o75mP4i_Jw77mYu6TLrck5Vlyu3c,o75mP4vDmHl_uqgDNm0GEbuUl4yU,o75mP4ti4hUPzIT2l3nuWE5GCRTw,o75mP4qbwg-f7eFqnXcHQqIluYBY,o75mP4rTx_0qs0VddeMy1rdPNgZQ,o75mP4qsFcYRCvlFGqEeLzjDKTRw,o75mP4oWE46DkJGjyFifCHTau8XI,o75mP4pgmaoNwrFdlusCopUQ5Plg,o75mP4iW9b5h2tFPj3EV9QHqJdjA,o75mP4r1DO1Zs-xJ2El6EnATk2zU,o75mP4rqgpiDo38j3DAOXFBAR6MQ,o75mP4pcZFWImHVbxkY7-_MgB2Z0,o75mP4kUSLOLBlkca1qioI5sA4Ak,o75mP4gh9PQVggRq0nmYUkE39S4I,o75mP4mpbBCxryTs5L6CJSlscTx4,o75mP4rmLbfJu3AirLOyDutNKnLQ,o75mP4u60MFvqXPwkV8E7ZxBk90I,o75mP4gtLanRjIVji2o55mzNurGA,o75mP4u_QBMwvj-WKdzdz-9RDUpU,o75mP4lN6R-Nuq2Qc7q3TiHLulUU,o75mP4tF7Niy8solzv9QKdf6_ok4,o75mP4oS21avIuorAacR86qGcjk0,o75mP4mK0jX_6jJbkxb8NshopTPw,o75mP4lA8F3u3SHLI1_wtWAe4npQ,o75mP4pEYL7ErKKOfdSAeymNW-Hg,o75mP4oBxSKj3xI7Y3YhnMzeEdMI,o75mP4lAEsLjKvWe7Xg-nAEvhtkE,oUZP64jA28lzVkGpO8Dk3RGk1Sis,o75mP4ipoCIGZx39267rNs5vwNHU,o75mP4u3xzyMYjHvdDkOWoyWEOLc,o75mP4msZUq2JH4O7OC0UviAfw40,o75mP4iGgubSMH5SGXoTlDld0Yws,o75mP4iNV1fPq9oYmQInJb7pqc7I,o75mP4lt-qO6ho4gLPFOnrmwrQK4,o75mP4ujlfa9_dEA9vsMcSrwJHL4,o75mP4jyLvLnlK4V1tTle5c-XBZQ,o75mP4pb3PDGhOte0oGUSrg-MwdQ,o75mP4pgEWpxhENUfTGDpmB_CywA,o75mP4pB0Pg08Qm49tw_Bxv21SlM,o75mP4jBKnH0IZwSa_bTsqP9SHmg,o75mP4gytoFLx2SVyOYBC2q5b3Eo,o75mP4vKEGIhUAaXOjt2shSXJcDA,o75mP4gDX6NylUHlEk2ADhohda30,o75mP4gJuDXrMo-uSHL9fFqSmjHs,o75mP4p7Zu-sL3gNJyGA5clF6zFY,o75mP4lG_ZL3hLXOYbUWDn2KS0gA,o75mP4huAI3d-ppiFtXehaxRCxy4,o75mP4ooRFBeUoZRkTj0__g-Qy8M,o75mP4rFWDDTxASI0y2Yux-TigIE,o75mP4gY5hNCztAHHi4dqNxsJnhU,o75mP4tIb5xl_5cRPklK6kEnweF0,o75mP4qoO92I4EdPn9m-Z2zDzJRw,o75mP4hoTS6amBM3Eki-a8Irvwy8,o75mP4nnrFrlT9mvpF6496K9_jFE,o75mP4tuPhqu7XoF3lssLtyMzDZ4,o75mP4hicarL895Op3luBXofPrkg,o75mP4ji4or-Hh22Lomvv963GORw,o75mP4k8VwCKN2O_-_bdh-LDf_eo,o75mP4vGey_LGU3kefqgBJ42Yki8,o75mP4pOmEjdLF5fiviRqop2BH-M,o75mP4sgL8x07A6IwGJYkkq5zugE,o75mP4izt1GVZJvJ5Zk21hUgQEH4,o75mP4qEcZZypmJed4x1L68oGHkg,o75mP4nTrrHcHgBE_Mp6Ph80gEzM,o75mP4qDxHTr-WcMIDZUCZiKnP-I,o75mP4l7apfVSQSXGPc0Id6tuzCs,o75mP4ofTAieICeXtz8a3kHWZaBc,o75mP4juz4yFuBD0Y0OjZjq-DTd0,o75mP4ksZEGtUHHxvhpFOTi_TwrE,o75mP4i0aylgPuD62c0LsgwUUj3M,o75mP4jv6Xas9jIMzGhYgh1JSmUI,o75mP4vjSQv3goGlXa8LXDUE-h2k,o75mP4nEu4EKXvnJ1mx5_jsUqHqk,o75mP4qjM5DH9oAmuNN6F4jsG8eg,o75mP4qJS9YJrTFdPm2x6AELkAeU,o75mP4r0YcOxBjDRlYyXVvhkabMk,o75mP4l3IsNplOV_-1x4rvx15osE,o75mP4iyn7ILtPA2QkIv7OAMmYzU,o75mP4hseeUEu8w1euwJ9rudpLzI,o75mP4i1dFE8x4yVjAEruKugJdHI,o75mP4vc9w3dWAvIrqBfKIVCi-JI,o75mP4jF5uKyVq9x3FZrrHT4mNhM,o75mP4gHWHTG3V6jKWbf4VgnysNY,o75mP4rYFC_I_OtqPS4zvrPySiX4,o75mP4tHM1Wzx_iEzXy9BX2fDTTU,o75mP4vZ4L1AtYTRHMrwt7sKvkYI,o75mP4sgnmPqSuxzNlODh93bZoTY,o75mP4pSTCv4d1s1uAfkWXJw8XGc,o75mP4uhwbyjzJre0eyI3Vm2MoRE,o75mP4s0306KPyB9tnYs9AhNqBKo,o75mP4pMR7MTwktPgg-qBIOYB4lg,o75mP4ki0NIgEHuGYn75lx5pEhHM,o75mP4uBV9-Wd3rgta-KMOjvmtNM,o75mP4gKGrwvsvrl01p3DvrKke7E,o75mP4k2OLW6TQpnaKly-B1KQvpo,o75mP4iL1KY1F0X98LHXqhz67SJA,o75mP4mcK3XPZSvavVzk2jcoDXKA,o75mP4rc0NrGYOrfHx4RHD0SUp4o,o75mP4ul7DEiCBM6tLmn7FQ-evKs,o75mP4vlpgZ-5wovn4qZ28eObsw8,o75mP4v_RReu5Un0eMsuZ4rlD_HM,o75mP4rR1ZNTFjSlPMN5BdInTj5c,o75mP4t0USrJin9kG9qSiPzKra9M,o75mP4spGb_O99tPzjFP_ctF_UVM,o75mP4ssCWsW7fpnnVAy2NPW7cLI,o75mP4vFnvKHHgZbPCU-_m84zfWU,o75mP4mi5buFepKPiApoy2QOOPe4,o75mP4vamcX-RpjqsrONit7-sj3M,o75mP4q3MpJGnaOFEMtc6mXJ4clU,o75mP4gmQt0Xtw-rGp-YXzCMk-UM,o75mP4lxQlTTDWqq4cc2z5UybL2U,o75mP4vsnR7J-nLwxu4XUYfCYKe4,o75mP4mRau4i4K3EQa5jJQ5HExcw,o75mP4mXb99zYvh6jhkeGJ4xrO-o,o75mP4sbUxUEF8x13n2x0UlGbdws,o75mP4tDAhwLwH_tYrHVyJZp4XPI,o75mP4hyoA2Jull42xBtL4AsAV5E,o75mP4puJ-WqX5cR2X_mgUQgYkng,o75mP4oOAd5aukKQbRRH-3P2IANE,o75mP4gKhw1FCxFn5ZZ2jfMWXFsk,o75mP4gQQqwHp99xWxYvH_DwujXI,o75mP4klLpgapABQ7u6KYy0ceRgM,o75mP4ou7XfSmG-DOKJAEwjGJt68,o75mP4kq5aFF1ySSvOBitukkVZgU,o75mP4luqobDgF8KYf2HQAXfSMY4,o75mP4tqbbzDXaSpnJgHyXpV3SRc,o75mP4hBjmW1R0yRkg1tUGsPBYQ4,oUZP64gFahwEkWdh5Jijw2qeNysc,o75mP4oEJBvJtZpnlm2yjbNg1RYE,o75mP4h4EvJsIf-9B1p4csLDu0rs,o75mP4j0guSw4_t5gK5AVwYwy-CA,o75mP4pm6X3W-yjpOcKzj6NLI5CU,o75mP4jj0qc9hZ-lAkY4jKiLC628,o75mP4q7-Sy61vLnVpOi4dyNXo0M,o75mP4tQB5lE_jBGD6NISujDpsLg,o75mP4iJEB9Z_ggOJaPxxhUH2TTg,o75mP4u07K6yuGfdtRA_cw0tVOqU,o75mP4m_mhX6QRuOCjudfyfOcwGw,o75mP4sfz2gEFIwvEm-ncZKc6D7Q,o75mP4vqZkJoN1gw1vmru6ZUvN7w,o75mP4u68hngU2E8-D55QVd2Sydc,o75mP4jrtbRtz2u6WrvmTv8PNUHs,o75mP4n-9C2ISWYxP5UFPAmuVaSw,o75mP4vh63zCMK29hBMz1uj8IplU,o75mP4qFLVn-EVu7QlonA_92uBmU,o75mP4py1ZI_e3DOjG0nYJ89siUs,o75mP4s_cmtXKRe9St2AK_pbCtnM,o75mP4sC75DaywYpFaSEY6VTDP24,o75mP4r0383wuzZ2i9qKKUXg94jA,o75mP4gk-PFTDO-2px-IFpD6u4W0,o75mP4oifZAWbFJuKMK8d1muo0fA,o75mP4u_pBxPks1j_P7ykfsnHIRs,o75mP4sRSJ-CxadTiKieRlbIIZnc,o75mP4jBLQxA0QgyIeMMumgO2W4c,o75mP4ia4WlQ-7ZrvXpGVCXm50vk,o75mP4h3wDLNrhygaC4RFiHtCJ9U,o75mP4nrFRJR0QLNFheuOTB6rJz4,o75mP4vDXm8JlBhkA3rIKGgjRu3E,o75mP4m_s1MhITaRjX73-DsIQt_c,o75mP4kU0R4AdsaNNqg2vwlmk8WI,o75mP4nQ_dpkKx-3L7pYqlHT-Z1s,o75mP4gRrc2AcJeVeG0yUT39d7qU,o75mP4hkrm2JvaqSCCwgy8zIiQ3c,o75mP4uNG1z9jh2oY4teoe6kXcnE,o75mP4rRM-iok2ioJaZCmWTxO7yI,o75mP4toeNUSPJdTVPiImqxGBWCE,o75mP4lCXS_RVEdrc5vuDDLZxD5k,o75mP4o1O31gAe4DN63zd-BgYL3Q,o75mP4iMvT39-RFKLYrlhH_eO7V8,o75mP4hmZ7fxYYH97TC58RrEyV9k,o75mP4tYPw3_I2_hZ1UTf9YHMc80,o75mP4mIH-zg4C44GGojZ_zNb5hY,o75mP4nTVoY47oQdregYkM7L9SsQ,o75mP4sR3d4_mbPFb3kkX0Xo7s_k,o75mP4knDFZftiSJB6b6uZKMKlBk,o75mP4vWiqycHhuCI9nKmhTLhxFM,o75mP4jbpeXprT3GsM8tBe-zB3Ws,o75mP4pKsW86a8wjumSVySQ59LF8,o75mP4ltP87mWL6WwmFyutz6RNqM,o75mP4nUQcdu71eUEiQo_OIBK2VU,o75mP4jphQpvHP5bc3juKAgBN650,o75mP4t50UPqXdT1V7s3YPThmI8I,o75mP4tTQun5HFh0LqpDCPjcLQJU,o75mP4uv1Fp5sPfnlW4-qY2OyeZA,o75mP4tQagCP8yAtfZWnfVE7IgII,o75mP4roS2ibY4M8Ao5LBykotlDs,o75mP4gxmaGa9uvVL_q9EtH5UKbQ,o75mP4mSbGZkBY-9pkW-kuuya_lA,o75mP4oJH05GKqmLrC-YN0t6aMzE,o75mP4rnVZl1ju3pLDBFTtSstaHM,o75mP4rOqFKico2jIT_fpYYjw_Xs,o75mP4qh19tgsY4y6l5szvOmpuvk,o75mP4sQiG_pdOBDj8Dg6vRLdsno,o75mP4iHX5spvdYb-s__Kj6B5qTE,o75mP4uPUf3gqdI8pKCe8zkHez8M,o75mP4mJEqyzGwhFv4HlWILkHkz0,o75mP4laI7uS1Q2wbPNFRGx4Xz5c,o75mP4vLSIKTT8b1jqC6CXpKwvOk,o75mP4hAgbYTBmM8SHStB0ePAdcQ,o75mP4lpguBrL-ZqoTu1uXxvUltk,o75mP4mZha3WC8xYmQl7O9G9iGC4,o75mP4rj6Og2ry8qLlPbsro8wt9U,o75mP4hNSfuVBOKhrN8aog9ZKBaw,o75mP4gVuT0zAirhjC-dEmR9548M,o75mP4neviRRIimGFG5jfnohDnl8,o75mP4mvj1DOfxqKfNcEiCC5d24Y,o75mP4r-rq5xBkU_IAIT69j4cNzs,o75mP4uDrsC2VE70ed4T3y9u4qKY,o75mP4pAfApJomXeydxiPSOzdqiA,o75mP4hVFYCEvSeSEM08G_xrLqWs,o75mP4lSy0N4UqqwjMlUVX259h34,o75mP4uJPL9yJj6TrFTnEZRxwR2A,o75mP4lgLoEurvfRW9rZ9mboXZ94,o75mP4g7DFupCIrcx1h78IQT66Z0,o75mP4mYp5iI-8zCqpooV6lDZVho,o75mP4lN5d1vTOs7zQvglXpu4Enw,o75mP4pSUWDTqMoyumKA6PEqxx1o,o75mP4hM6SXKLCd81RpvTAIujeLM,o75mP4gozFZ9FF8-2AqsELruU43k,o75mP4sPjxIjXW8S9ehLUOSOpCdM,o75mP4qAKJlaTD6OIVO9tpHAmESk,o75mP4rBokVvqwZ4nxa27LSpIijM,o75mP4ggXnqApbfYuh2128rBL12w,o75mP4oSai8k-ILJx24tVPQY4IwA,o75mP4thPLcJdx0InE43ZnXBkDG4,o75mP4hcHJRcKVahGu7zqpMlq2NQ,o75mP4rbPVyAyYrHk2iX8ggI40H4,o75mP4kIsCALCAn50G2GqvdPeN_I,o75mP4sOr64aEnoaD2scr_LXA-M8,
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
         * tags : Wi-Fi,白板,茶歇,打印,纸笔,发票,投影仪,激光笔,转换器,多媒体屏,蓝牙音箱,电源插座,智能翻译,
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
         * commentcount : 4
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
        private String commentcount;

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

        public String getCommentcount() {
            return commentcount;
        }

        public void setCommentcount(String commentcount) {
            this.commentcount = commentcount;
        }
    }
}
