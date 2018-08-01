import mojolly.inflector.Inflector

object CreateInsertQuery {
  val tableName = "cleansed_activities"

  //  val personMasterSchema ="customer_id|person_id                       |address1         |address2|address_id                      |address_quality_indicator|address_type|adults_in_living_unit|age|age_group|beehive_cluster|call_me|call_me_reasons|carrier_route|census_block|census_tract|child_age_buckets|child_four_to_six_bkt|child_seven_to_nine_bkt|child_sixteen_to_eighteen_bkt|child_ten_to_twelve_bkt|child_thirteen_to_fifteen_bkt|child_zero_to_three_bkt|children_in_living_unit|city   |cmpids|combined_owner|core_based_statistical_area|core_based_statistical_area_type|county|county_code|created_on           |data_source_id|date_of_birth|date_of_death|deceased_flag|delivery_point_code|delivery_point_validation|direct_mail_me|direct_mail_me_reasons|donates_to_charity|dwell_type|education|email_me|email_me_reasons|email_preferences|emails|employer|estimated_home_value|financial_class|financial_class_id|first_name|has_gender_conflict|has_primary_care_physician|health_system_employee|holdout_flag|home_land_value|home_year_built|household_composition|household_id                    |household_income|household_preference|inferred_payer_type|language|last_name|latitude|length_of_residence|listids|locations|longitude|mail_responder|marital_status|metropolitan_statistical_area|middle_name|mosaic_global_zip_4|mosaic_zip_4|move_type|mrids                         |occupation|occupation_group|payer_type|person_id_global|person_type|personal_suffix|persons_in_living_unit|phone_numbers|portal_status|prefix|presence_of_child|primary_care_physician|primary_metropolitan_statistical_area|professional_suffix|propensities|purl|race|recipes         |recipient_reliability_code|religion|sex|source_name|state|street_house_number|street_name|street_post_direction|street_pre_direction|street_second_number|street_second_unit|street_suffix|text_me|text_me_reasons|updated_at           |valid_address_flag|wealth_rating|zip4|zip5"
  val personMasterSchema ="customer_id | person_id                        | address1           | address2 | address_id                       | address_quality_indicator | address_type | adults_in_living_unit | age | age_group | beehive_cluster | call_me | call_me_reasons | carrier_route | census_block | census_tract | child_age_buckets | child_four_to_six_bkt | child_seven_to_nine_bkt | child_sixteen_to_eighteen_bkt | child_ten_to_twelve_bkt | child_thirteen_to_fifteen_bkt | child_zero_to_three_bkt | children_in_living_unit | city    | cmpids | combined_owner | core_based_statistical_area | core_based_statistical_area_type | county | county_code | customer | data_source_id | date_created                    | date_modified                   | date_of_birth | date_of_death | deceased_flag | delivery_point_code | delivery_point_validation | direct_mail_me | direct_mail_me_reasons | donates_to_charity | dwell_type | education | email_me | email_me_reasons | email_preferences | emails | employer | estimated_home_value | financial_class             | financial_class_id | first_name | has_gender_conflict | has_primary_care_physician | health_system_employee | holdout_flag | home_land_value | home_year_built | household_composition | household_id                     | household_income | household_preference | inferred_payer_type | language | last_name | latitude | length_of_residence | listids | locations | longitude | mail_responder | marital_status | metropolitan_statistical_area | middle_name | mosaic_global_zip_4 | mosaic_zip_4 | move_type | mrids                                   | occupation | occupation_group | payer_type | person_id_global | person_type | personal_suffix | personal_url | persons_in_living_unit | phone_numbers  | portal_status | prefix | presence_of_child | primary_care_physician | primary_email | primary_metropolitan_statistical_area | primary_phone_number | primary_phone_number_type | professional_suffix | propensities| race | recipes       | recipient_reliability_code | religion | sex | source_name | state | street_house_number | street_name | street_post_direction | street_pre_direction | street_second_number | street_second_unit | street_suffix | text_me | text_me_reasons | valid_address_flag | wealth_rating | zip4 | zip5"
  val cleansedActivitySchema ="customer|batch_id                        |bucket_number|activity_id                         |activity|activity_date        |activity_group|activity_group_id|activity_location|activity_location_id|activity_type|address1         |address2|address_id|address_quality_indicator|address_status|address_type|admit_date|adults_in_living_unit|age|age_group|assessment_results|attending_id|barcode     |beehive_cluster|body_mass_index|business_unit|business_unit_id|call_me|call_me_reasons|carrier_route|cass_stand|census_block|census_tract|charges|child_age_buckets|child_four_to_six_bkt|child_seven_to_nine_bkt|child_sixteen_to_eighteen_bkt|child_ten_to_twelve_bkt|child_thirteen_to_fifteen_bkt|child_zero_to_three_bkt|children_in_living_unit|city        |clinic|clinic_id|combined_owner|contribution_margin|core_based_statistical_area|core_based_statistical_area_type|cost|country|county|county_code|county_federal_information_processing_standards|current_procedural_terminology_codes|customer_id|data_source_id|date_created           |date_modified          |date_of_birth|date_of_death|deceased_flag|delivery_point_barcode|delivery_point_code|delivery_point_validation|delivery_point_validation_footnote|diagnosis_codes|diagnosis_service_line_1|diagnosis_service_line_2|diastolic|direct_mail_me|direct_mail_me_reasons|discharge_date|discharge_status|donates_to_charity|dwell_type|education|email|email_me|email_me_reasons|emails|employer|employer_id|enhanced_line_of_travel|er_patient|estimated_home_value|ethnic_insight|exclusion_flag|facility|facility_id|final_bill_date|financial_class          |financial_class_id|financial_class_id_orig|financial_class_orig|first_name|guarantor_address_1|guarantor_address_2|guarantor_city|guarantor_country|guarantor_first_name|guarantor_full_name|guarantor_last_name|guarantor_middle_name|guarantor_state|guarantor_zip_5|has_primary_care_physician|health_system_employee|height|holdout_flag|home_land_value|home_phone|home_year_built|hospital|hospital_id|household_composition|household_id|household_income|household_preference|inferred_payer_type|insurance|insurance_id|lacs|language|last_name|latitude|length_of_residence|length_of_stay|llk_footnote|location_id|locations|longitude|mail_responder|marital_status|medical_codes|medical_groups|medical_severity_diagnosis_related_group|medical_severity_diagnosis_related_group_detail_level|medical_severity_diagnosis_related_group_service_line|medical_severity_diagnosis_related_group_sub_service_line|message_type|metropolitan_statistical_area|middle_name|mobile_phone|mosaic_global_zip_4|mosaic_zip_4|move_type|moved_from_zip_5|moved_to_zip_5|mrids|ncoa_action_code|ncoa_anklink_code|ncoa_move_date|ncoa_move_type|occupation|occupation_group|patient_type|payer_type|person_id|person_type|personal_suffix|personal_url|persons_in_living_unit|phone_numbers|physician_first_name|physician_full_name|physician_last_name|physician_middle_name|physician_national_provider_identifier|physician_personal_suffix|physician_primary_speciality|physician_primary_speciality_code|physician_professional_suffix|portal_status|practice_location|practice_location_id|prefix|presence_of_child|primary_care_physician|primary_care_physician_id|primary_email|primary_metropolitan_statistical_area|primary_phone_number|primary_phone_number_type|primary_service_line|procedure_service_line_1|procedure_service_line_2|procedure_service_line_3|professional_suffix|profit|prognosis_codes|providers|race|reason|reason_id|recipient_reliability_code|referencing_id|religion|revenue|service_lines|sex|site|site_id|source  |source_activity_type|source_client|source_discharge_status|source_dns_reason|source_er_patient|source_exclusion_flag|source_financial_class|source_financial_class_id|source_marital_status|source_name|source_patient_type|source_person_id|source_race|source_record_id|source_sex|source_type|state|street_house_number|street_name|street_post_direction|street_pre_direction|street_second_number|street_second_unit|street_suffix|systolic|text_me|text_me_reasons|valid_address_flag|visit_total_charges|wealth_rating|weight|work_phone|zip       |zip4|zip5"
  val personActivitySchema =""

  val cleansedActivityRecord0 = "tanner  |tanner-prospect-standard-2017-08|12           |aac32f5a-1acc-42d8-b123-0d9328f08ade|null    |2017-08-01 00:00:00.0|null          |null             |null             |null                |EXPERIAN     |3448 STEMBLER RDG|null    |0294438779|E                        |null          |HOME        |null      |5                    |27 |G        |Map()             |null        |301357611481|99             |null           |null         |null            |null   |[]             |R024         |2         |2008        |080509      |null   |[]               |U                    |U                      |N                            |U                      |N                            |U                      |0                      |DOUGLASVILLE|null  |null     |H             |null               |12060                      |A                               |null|null   |null  |097        |13097                                          |Map()                               |20004      |null          |2018-07-12 06:50:40.632|2018-07-22 02:43:43.731|null         |null         |null         |481                   |481                |YN AABB                  |AABB                              |Map()          |[]                      |[]                      |null     |null          |[]                    |null          |null            |U                 |S         |3        |null |null    |[]              |[]    |null    |null       |0036D                  |null      |K                   |null          |null          |null    |null       |null           |null                     |null              |null                   |null                |BRIANA    |null               |null               |null          |null             |null                |null               |null               |null                 |null           |null           |null                      |null                  |null  |null        |73.0           |null      |2001           |null    |null       |H                    |null        |L               |null                |null               |null     |null        |    |01      |EMORY    |33.7132 |15                 |null          |null        |null       |[]       |-84.7272 |Y             |U             |[]           |[]            |null                                    |[]                                                   |[]                                                   |[]                                                       |PROSPECT    |0520                         |L          |null        |B                  |A02         |null     |null            |null          |[]   |C               |null             |null          |null          |00        |I8              |null        |null      |null     |P          |null           |null        |5                     |[7709202379] |null                |null               |null               |null                 |null                                  |null                     |null                        |null                             |null                         |null         |null             |null                |MS    |Y                |null                  |null                     |null         |null                                 |null                |null                     |[]                  |[]                      |[]                      |[]                      |null               |null  |Map()          |[]       |U   |null  |null     |1                         |null          |P       |null   |[]           |F  |null|null   |EXPERIAN|null                |null         |null                   |null             |null             |null                 |null                  |null                     |null                 |null       |null               |3723598395      |null       |3723598395      |null      |PROSPECT   |GA   |3448               |STEMBLER   |null                 |null                |null                |null              |RDG          |null    |null   |[]             |true              |null               |7            |null  |null      |30135-7611|7611|30135"
  val cleansedActivityRecord1 = "tanner  |tanner-prospect-standard-2017-08|5            |bfb214a0-151b-447e-a5de-57efda06d95e|null    |2017-08-01 00:00:00.0|null          |null             |null             |null                |EXPERIAN     |3448 STEMBLER RDG|null    |0294438779|E                        |null          |HOME        |null      |5                    |51 |L        |Map()             |null        |301357611481|99             |null           |null         |null            |null   |[]             |R024         |2         |2008        |080509      |null   |[]               |U                    |U                      |N                            |U                      |N                            |U                      |0                      |DOUGLASVILLE|null  |null     |H             |null               |12060                      |A                               |null|null   |null  |097        |13097                                          |Map()                               |20004      |null          |2018-07-12 06:50:40.632|2018-07-22 02:43:43.731|1967-03-02   |null         |null         |481                   |481                |YN AABB                  |AABB                              |Map()          |[]                      |[]                      |null     |null          |[]                    |null          |null            |U                 |S         |3        |null |null    |[]              |[]    |null    |null       |0036D                  |null      |K                   |null          |null          |null    |null       |null           |null                     |null              |null                   |null                |ANGELA    |null               |null               |null          |null             |null                |null               |null               |null                 |null           |null           |null                      |null                  |null  |null        |73.0           |null      |2001           |null    |null       |H                    |null        |L               |null                |null               |null     |null        |    |01      |EMORY    |33.7132 |15                 |null          |null        |null       |[]       |-84.7272 |Y             |U             |[]           |[]            |null                                    |[]                                                   |[]                                                   |[]                                                       |PROSPECT    |0520                         |K          |null        |B                  |A02         |null     |null            |null          |[]   |C               |null             |null          |null          |00        |I5              |null        |null      |null     |P          |null           |null        |5                     |[7709202379] |null                |null               |null               |null                 |null                                  |null                     |null                        |null                             |null                         |null         |null             |null                |MS    |Y                |null                  |null                     |null         |null                                 |null                |null                     |[]                  |[]                      |[]                      |[]                      |null               |null  |Map()          |[]       |U   |null  |null     |1                         |null          |P       |null   |[]           |F  |null|null   |EXPERIAN|null                |null         |null                   |null             |null             |null                 |null                  |null                     |null                 |null       |null               |3778644242      |null       |3778644242      |null      |PROSPECT   |GA   |3448               |STEMBLER   |null                 |null                |null                |null              |RDG          |null    |null   |[]             |true              |null               |7            |null  |null      |30135-7611|7611|30135"
  val cleansedActivityRecord2 = "tanner  |tanner-prospect-standard-2017-08|15           |82265f10-d41a-4595-a776-4b57a1a9500e|null    |2017-08-01 00:00:00.0|null          |null             |null             |null                |EXPERIAN     |3448 STEMBLER RDG|null    |0294438779|E                        |null          |HOME        |null      |5                    |30 |H        |Map()             |null        |301357611481|1              |null           |null         |null            |null   |[]             |R024         |2         |2008        |080509      |null   |[]               |U                    |U                      |N                            |U                      |N                            |U                      |0                      |DOUGLASVILLE|null  |null     |H             |null               |12060                      |A                               |null|null   |null  |097        |13097                                          |Map()                               |20004      |null          |2018-07-12 06:50:40.632|2018-07-22 02:43:43.731|null         |null         |null         |481                   |481                |YN AABB                  |AABB                              |Map()          |[]                      |[]                      |null     |null          |[]                    |null          |null            |U                 |S         |4        |null |null    |[]              |[]    |null    |null       |0036D                  |null      |K                   |null          |null          |null    |null       |null           |target payer - profitable|9910              |null                   |null                |RTO       |null               |null               |null          |null             |null                |null               |null               |null                 |null           |null           |null                      |null                  |null  |null        |73.0           |null      |2001           |null    |null       |H                    |null        |L               |null                |null               |null     |null        |    |01      |EMORY    |33.7132 |15                 |null          |null        |null       |[]       |-84.7272 |Y             |M             |[]           |[]            |null                                    |[]                                                   |[]                                                   |[]                                                       |PROSPECT    |0520                         |null       |null        |B                  |A02         |null     |null            |null          |[]   |C               |null             |null          |null          |02        |K3              |null        |pi        |null     |P          |null           |null        |5                     |[7709202379] |null                |null               |null               |null                 |null                                  |null                     |null                        |null                             |null                         |null         |null             |null                |MS    |Y                |null                  |null                     |null         |null                                 |null                |null                     |[]                  |[]                      |[]                      |[]                      |null               |null  |Map()          |[]       |U   |null  |null     |1                         |null          |P       |null   |[]           |F  |null|null   |EXPERIAN|null                |null         |null                   |null             |null             |null                 |null                  |null                     |null                 |null       |null               |2089393089      |null       |2089393089      |null      |PROSPECT   |GA   |3448               |STEMBLER   |null                 |null                |null                |null              |RDG          |null    |null   |[]             |true              |null               |7            |null  |null      |30135-7611|7611|30135"
  val cleansedActivityRecord3 = "tanner  |tanner-prospect-standard-2017-08|23           |8ff453de-a8fc-407a-9f0c-676357b1fbd6|null    |2017-08-01 00:00:00.0|null          |null             |null             |null                |EXPERIAN     |3448 STEMBLER RDG|null    |0294438779|E                        |null          |HOME        |null      |5                    |28 |G        |Map()             |null        |301357611481|1              |null           |null         |null            |null   |[]             |R024         |2         |2008        |080509      |null   |[]               |U                    |U                      |N                            |U                      |N                            |U                      |0                      |DOUGLASVILLE|null  |null     |H             |null               |12060                      |A                               |null|null   |null  |097        |13097                                          |Map()                               |20004      |null          |2018-07-12 06:50:40.632|2018-07-22 02:43:43.731|null         |null         |null         |481                   |481                |YN AABB                  |AABB                              |Map()          |[]                      |[]                      |null     |null          |[]                    |null          |null            |U                 |S         |3        |null |null    |[]              |[]    |null    |null       |0036D                  |null      |K                   |null          |null          |null    |null       |null           |target payer - profitable|9910              |null                   |null                |BRENT     |null               |null               |null          |null             |null                |null               |null               |null                 |null           |null           |null                      |null                  |null  |null        |73.0           |null      |2001           |null    |null       |H                    |null        |L               |null                |null               |null     |null        |    |01      |EMORY    |33.7132 |15                 |null          |null        |null       |[]       |-84.7272 |Y             |M             |[]           |[]            |null                                    |[]                                                   |[]                                                   |[]                                                       |PROSPECT    |0520                         |C          |null        |B                  |A02         |null     |null            |null          |[]   |C               |null             |null          |null          |00        |I4              |null        |pi        |null     |P          |null           |null        |5                     |[7709202379] |null                |null               |null               |null                 |null                                  |null                     |null                        |null                             |null                         |null         |null             |null                |MR    |Y                |null                  |null                     |null         |null                                 |null                |null                     |[]                  |[]                      |[]                      |[]                      |null               |null  |Map()          |[]       |U   |null  |null     |1                         |null          |P       |null   |[]           |M  |null|null   |EXPERIAN|null                |null         |null                   |null             |null             |null                 |null                  |null                     |null                 |null       |null               |3778644244      |null       |3778644244      |null      |PROSPECT   |GA   |3448               |STEMBLER   |null                 |null                |null                |null              |RDG          |null    |null   |[]             |true              |null               |7            |null  |null      |30135-7611|7611|30135"
  val cleansedActivityRecord4 = "tanner  |tanner-prospect-standard-2017-08|9            |230f73ff-72d5-4c73-a44f-9002c5a1101f|null    |2017-08-01 00:00:00.0|null          |null             |null             |null                |EXPERIAN     |3448 STEMBLER RDG|null    |0294438779|E                        |null          |HOME        |null      |5                    |24 |F        |Map()             |null        |301357611481|99             |null           |null         |null            |null   |[]             |R024         |2         |2008        |080509      |null   |[]               |U                    |U                      |N                            |U                      |N                            |U                      |0                      |DOUGLASVILLE|null  |null     |H             |null               |12060                      |A                               |null|null   |null  |097        |13097                                          |Map()                               |20004      |null          |2018-07-12 06:50:40.632|2018-07-22 02:43:43.731|null         |null         |null         |481                   |481                |YN AABB                  |AABB                              |Map()          |[]                      |[]                      |null     |null          |[]                    |null          |null            |U                 |S         |1        |null |null    |[]              |[]    |null    |null       |0036D                  |null      |K                   |null          |null          |null    |null       |null           |null                     |null              |null                   |null                |MARISSA   |null               |null               |null          |null             |null                |null               |null               |null                 |null           |null           |null                      |null                  |null  |null        |73.0           |null      |2001           |null    |null       |H                    |null        |L               |null                |null               |null     |null        |    |01      |EMORY    |33.7132 |15                 |null          |null        |null       |[]       |-84.7272 |Y             |U             |[]           |[]            |null                                    |[]                                                   |[]                                                   |[]                                                       |PROSPECT    |0520                         |K          |null        |B                  |A02         |null     |null            |null          |[]   |C               |null             |null          |null          |00        |I4              |null        |null      |null     |P          |null           |null        |5                     |[7709202379] |null                |null               |null               |null                 |null                                  |null                     |null                        |null                             |null                         |null         |null             |null                |MS    |Y                |null                  |null                     |null         |null                                 |null                |null                     |[]                  |[]                      |[]                      |[]                      |null               |null  |Map()          |[]       |U   |null  |null     |1                         |null          |P       |null   |[]           |F  |null|null   |EXPERIAN|null                |null         |null                   |null             |null             |null                 |null                  |null                     |null                 |null       |null               |3778644452      |null       |3778644452      |null      |PROSPECT   |GA   |3448               |STEMBLER   |null                 |null                |null                |null              |RDG          |null    |null   |[]             |true              |null               |7            |null  |null      |30135-7611|7611|30135"

  val record0 = "20004 | 70175f3b1b60bb9a42091913514869fa | 1008 FLAGSTONE WAY |     null | d24250e72182a67c74f50f024d91048f |                         E |         home |                     2 |  53 |         L |              28 |    True |            null |          R047 |         2013 |       120103 |             {'E'} |                     N |                       N |                             N |                       N |                             N |                       N |                       0 | ACWORTH |   null |              H |                       12060 |                                A |   null |         223 |   tanner |           null | 2018-07-08 00:00:00.000000+0000 | 2018-07-08 00:00:00.000000+0000 |    1964-12-09 |          null |         False |                 085 |                   YN AABB |           True |                   null |                  U |          S |         4 |    False |  {'Email Error'} |              null |   null |     null |                    G | target payer - unprofitable |               9920 |      JAMES |               False |                       null |                   null |        False |            null |            null |                     D | 87879e97754901a5c1b02f04139bbb9f |                A |                    2 |                null |       01 |   BOUCHER |  34.0416 |                  10 |    null |     {900} |   84.7817 |              M |              M |                          0520 |           M |                   C |          F22 |      null | {'TANNER.EXPERIAN.PROSPECT.2889948717'} |         00 |               I1 |         ni |             null |           P |            null |         null |                      3 | {'7705297415'} |          null |     Mr |                 Y |                   null |          null |                                  null |                 null |                      null |                null | {'IP_sg10_prop_Cat': 3, 'IP_sg11_prop_Cat': 3, 'IP_sg14_prop_Cat': 4, 'IP_sg15_prop_Cat': 3, 'IP_sg16_prop_Cat': 3, 'IP_sg17_prop_Cat': 3, 'IP_sg19_prop_Cat': 3, 'IP_sg20_prop_Cat': 3, 'IP_sg21_prop_Cat': 3, 'IP_sg22_prop_Cat': 4, 'IP_sg2_prop_Cat': 3, 'IP_sg3_prop_Cat': 3, 'IP_sg4_prop_Cat': 3, 'IP_sg5_prop_Cat': 3, 'IP_sg6_prop_Cat': 3, 'IP_sg7_prop_Cat': 3, 'SN10_sg2_prop_Cat': 3, 'SN12_sg3_prop_Cat': 3, 'SN13_sg3_prop_Cat': 3, 'SN14_sg3_prop_Cat': 3, 'SN15_sg3_prop_Cat': 3, 'SN17_sg3_prop_Cat': 3, 'SN18_sg4_prop_Cat': 1, 'SN19_sg4_prop_Cat': 1, 'SN1_sg1_prop_Cat': 3, 'SN2_sg2_prop_Cat': 3, 'SN5_sg5_prop_Cat': 3, 'SN6_sg6_prop_Cat': 3, 'SN7_sg7_prop_Cat': 3, 'SN8_sg8_prop_Cat': 3, 'SN9_sg9_prop_Cat': 3} |    U | {'999000': 5} |                          1 |        C |   M |        null |    GA |                1008 |   FLAGSTONE |                  null |                 null |                 null |               null |           WAY |    True |            null |               True |             5 | 1902 | 30101"

  val record1 = "127        |56b174735fb0ff4436829cb4318b3efd|1223 DE CUNHA CT|null    |6a2f291c5bc2b84f5e295f007a46b29b|E                        |home        |7                    |58 |M        |26             |null   |[]             |C025         |2000        |010603      |[C]              |N                    |N                      |N                            |N                      |N                            |N                      |0                      |SALINAS|[]    |H             |41500                      |A                               |06053 |053        |2018-03-13 00:00:00.0|3             |1959-04-24 00:00:00.0|null         |null         |236                |YN AABB                  |null          |[]                    |U                 |S         |4        |null    |[]              |[]               |[]                          |null             |K                   |target payer - unprofitable|null              |STEPHANIE |null               |null                      |null                  |false       |null           |1994           |I                    |e0ece908311a6355103242f8cf4fdfad|A               |2                   |null               |01      |WILCOXEN |36.7056 |9                  |[]     |[670]    |121.6038 |M             |U             |7120                         |J          |C                  |B10         |null     |[EXPERIAN.PROSPECT.3191839797] |31        |K4              |NI        |null            |P          |null           |8                     |[]               |null         |MRS   |Y                |null                  |null                                 |null               |Map(SN2_sg2_prop_Cat -> 3, SN5_sg5_prop_Cat -> 4, IP_sg6_prop_Cat -> 3, IP_sg4_prop_Cat -> 3, IP_sg16_prop_Cat -> 3, SN6_sg6_prop_Cat -> 3, IP_sg3_prop_Cat -> 3, SN18_sg4_prop_Cat -> 1, SN16_sg3_prop_Cat -> 3, IP_sg22_prop_Cat -> 4, IP_sg8_prop_Cat -> 3, IP_sg11_prop_Cat -> 3, SN13_sg3_prop_Cat -> 4, IP_sg17_prop_Cat -> 3, IP_sg7_prop_Cat -> 2, SN10_sg2_prop_Cat -> 3, SN11_sg2_prop_Cat -> 3, SN4_sg4_prop_Cat -> 3, IP_sg15_prop_Cat -> 4, IP_sg14_prop_Cat -> 3, IP_sg19_prop_Cat -> 3, IP_sg2_prop_Cat -> 3, SN9_sg9_prop_Cat -> 2, SN12_sg3_prop_Cat -> 3, SN14_sg3_prop_Cat -> 3, IP_sg20_prop_Cat -> 3, IP_sg10_prop_Cat -> 3, SN1_sg1_prop_Cat -> 2, IP_sg21_prop_Cat -> 3, SN15_sg3_prop_Cat -> 3, SN19_sg4_prop_Cat -> 1, IP_sg5_prop_Cat -> 3)|null|null|Map(999000 -> 5)                                                            |1                         |P       |F  |null       |CA   |1223               |DE CUNHA   |null                 |null                |null                |null              |CT           |null   |[]             |2018-03-12 00:00:00.0|true              |null         |5034|93906"



  val recordList = List(cleansedActivityRecord0,cleansedActivityRecord1,cleansedActivityRecord2,cleansedActivityRecord3,cleansedActivityRecord4)

  val paSpltStr: List[String] = getSchema(tableName).split("\\|").toList.map(_.trim)

  def main(args: Array[String]) {
    recordList.foreach{
      rec => app(rec.split("\\|").toList.map(_.trim))
    }

    //    printColumnValue(personMasterSchema, recordList, "valid_address_flag")
  }

  def printColumnValue(columnStr: String, valueStr: List[String], columnList:String)  = {
    val spltStr: List[String] = columnStr.split("\\|").toList

    valueStr.foreach { value =>
      val spltStr1: List[String] = value.split("\\|").toList
      //      println(s"$columnList Index: ${spltStr.indexOf(columnList)}")
      println(s"$columnList: ${spltStr1(spltStr.indexOf(columnList))}")
    }

  }

  def app(lst: List[String]) = {
    val recordSpltStr: List[Int] = lst
      .zipWithIndex
      .filter(x => x._1.trim.equalsIgnoreCase("null") || x._1.trim.isEmpty ||x._1.trim.equalsIgnoreCase("[]") ||x._1.trim.equalsIgnoreCase("Map()"))
      .map(_._2)

    val columnStr = paSpltStr.filterNot(x => recordSpltStr.contains(paSpltStr.indexOf(x))).mkString(",")


    //    println(columnStr.length)
    val valueStr = lst.filterNot(x => recordSpltStr.contains(lst.indexOf(x)))
      .map(x => fixDatatypes(x, lst))
      .mkString(",")
    //    println(valueStr)
    val insertQuery = s"Insert into $tableName  ( $columnStr ) values ( $valueStr );"
    println(insertQuery)

    val columnList = "locations"
    //    printColumnValue(columnStr, valueStr, columnList)
  }

  def getTableName(str:String):String ={
    val tableName = Inflector.underscore("cleansedActivitySchemaMap").split("_")
    s"${tableName(0)}_${tableName(1)}"
  }

  def getSchema(tableName: String):String ={
    tableName match {
      case "cleansed_activities" => cleansedActivitySchema
      case "person_master" => personMasterSchema
      case "person_activities" => personActivitySchema
      case _ => personMasterSchema
    }
  }

  def getSchemaMap(tableName: String): Map[String, String] ={
    tableName match {
      case "cleansed_activities" => cleansedActivitySchemaMap
      case "person_master" => personMasterSchemaMap
      case "person_activities" => personActivitySchemaMap
      case _ => personMasterSchemaMap
    }
  }
  def fixDatatypes(str:String, lst: List[String]):String = {
    val dataType = getSchemaMap(tableName).getOrElse(paSpltStr(lst.indexOf(str)), "text")
    if(dataType.equalsIgnoreCase("text") || dataType.equalsIgnoreCase("date")) {
      "\'" + str + "\'"
    }
    else if (dataType == "timestamp"){
      correctDates(str)
    }
    //    else if (dataType.startsWith("list<")){
    //      correctLists(str)
    //    }
        else if (dataType.startsWith("set<")){
          correctSets(str)
        }
    //    else if (dataType.startsWith("map<")){
    //      correctMaps(str)
    //    }

    else
      str
  }

  def correctDates(date: String): String = {
    //    val spltDate = date.split(" ")
    //    val last = spltDate(1)
    //    "\'"+spltDate(0).split("\\.")(0)+"+"+last+"\'"
    "\'"+date.substring(0,19)+"\'"

  }

  def correctSets(str: String):String={
    //    println("set: "+str)
    val croppedStr = str.drop(1).dropRight(1)
    if (!croppedStr.isEmpty){
      val res = croppedStr.split(",").map(x => s"'${x.trim}'").mkString(",")
      s"{$res}"//.drop(1).dropRight(1)
    }
    else
      str
    //      s"[$croppedStr]".drop(1).dropRight(1)
  }

  def correctMaps(str: String):String={

    val croppedStr = str.drop(4).dropRight(1)
    //    if(str.equalsIgnoreCase("Map()")){
    //      s"{}"
    //    }
    if (!croppedStr.isEmpty){
      val res = croppedStr.split(",").map {
        x => s"${x.trim.replace(" -> ", "':")}"
      }.mkString(",")

      s"{$res}"//.drop(1).dropRight(1)
    }
    else
      str
    //      s"{$croppedStr}".drop(1).dropRight(1)
  }

  def correctLists(str: String):String={
    println("list: "+str)
    val croppedStr = str//.drop(1).dropRight(1)
    if (!croppedStr.isEmpty){
      val res = croppedStr.split(",").map(x => s"'${x.trim}'").mkString(",")
      s"[$res]"//.drop(1).dropRight(1)
    }
    else
      str

  }


  val personActivitySchemaMap = Map("customer_id"->"int",
    "person_id"->"text",
    "source_record_id"->"text",
    "source"->"text",
    "source_type"->"text",
    "updated_at"->"timestamp",
    "serviced_on"->"timestamp",
    "location_id"->"int",
    "activity_type"->"text",
    "mx_codes"->"list<text>",
    "mx_groups"->"set<int>",
    "providers"->"set<text>",
    "er_patient"->"boolean",
    "financial_class_id"->"int",
    "financial_class"->"text",
    "payer_type"->"text",
    "service_lines"->"set<text>",
    "patient_type"->"text",
    "discharge_status"->"int",
    "source_person_id"->"text",
    "admitted_at"->"timestamp",
    "discharged_at"->"timestamp",
    "final_bill_date"->"timestamp",
    "transaction_date"->"timestamp",
    "activity_date"->"timestamp",
    "hospital_id"->"text",
    "hospital"->"text",
    "business_unit_id"->"text",
    "business_unit"->"text",
    "site_id"->"text",
    "site"->"text",
    "clinic_id"->"text",
    "clinic"->"text",
    "practice_location_id"->"text",
    "practice_location"->"text",
    "facility_id"->"text",
    "facility"->"text",
    "employer_id"->"text",
    "employer"->"text",
    "financial_class_id_orig"->"text",
    "financial_class_orig"->"text",
    "insurance_id"->"text",
    "insurance"->"text",
    "charges"->"double",
    "cost"->"double",
    "revenue"->"double",
    "contribution_margin"->"double",
    "profit"->"double",
    "systolic"->"double",
    "diastolic"->"double",
    "height"->"double",
    "weight"->"double",
    "bmi"->"double",
    "guarantor_first_name"->"text",
    "guarantor_last_name"->"text",
    "guarantor_middle_name"->"text",
    "activity_id"->"text",
    "activity"->"text",
    "activity_group_id"->"text",
    "activity_group"->"text",
    "activity_location_id"->"text",
    "activity_location"->"text",
    "assessments"->"set<text>",
    "assessment_questions"->"set<text>",
    "assessment_answers"->"set<text>",
    "reason_id"->"text",
    "reason"->"text",
    "zip5"->"text" )

  val personMasterSchemaMap = Map(
    "updated_at"->"timestamp",
    "created_on"->"timestamp",
    "customer_id"->"int",
    "person_id"->"text",
    "address_id"->"text",
    "household_id"->"text",
    "person_id_global"->"text",
    "person_type"->"text",
    "mrids"->"set<text>",
    "first_name"->"text",
    "middle_name"->"text",
    "last_name"->"text",
    "prefix"->"text",
    "personal_suffix"->"text",
    "professional_suffix"->"text",
    "dob"->"timestamp",
    "dod"->"timestamp",
    "age"->"int",
    "age_group"->"text",
    "sex"->"text",
    "financial_class_id"->"int",
    "financial_class"->"text",
    "payer_type"->"text",
    "marital_status"->"text",
    "race"->"text",
    "portal_status"->"text",
    "religion"->"text",
    "language"->"text",
    "employer"->"text",
    "occupation_group"->"text",
    "occupation"->"text",
    "phone_numbers"->"set<text>",
    "emails"->"set<text>",
    "email_preferences"->"set<text>",
    "dwell_type"->"text",
    "combined_owner"->"text",
    "household_income"->"text",
    "recipient_reliability_code"->"int",
    "mail_responder"->"text",
    "length_of_residence"->"int",
    "persons_in_living_unit"->"int",
    "adults_in_living_unit"->"int",
    "children_in_living_unit"->"int",
    "home_year_built"->"int",
    "home_land_value"->"float",
    "estimated_home_value"->"text",
    "donates_to_charity"->"text",
    "mosaic_zip_4"->"text",
    "mosaic_global_zip_4"->"text",
    "hh_comp"->"text",
    "presence_of_child"->"text",
    "child_zero_to_three_bkt"->"text",
    "child_four_to_six_bkt"->"text",
    "child_seven_to_nine_bkt"->"text",
    "child_ten_to_twelve_bkt"->"text",
    "child_thirteen_to_fifteen_bkt"->"text",
    "child_sixteen_to_eighteen_bkt"->"text",
    "child_age_buckets"->"set<text>",
    "wealth_rating"->"int",
    "address_quality_indicator"->"text",
    "education"->"int",
    "address_type"->"text",
    "valid_address_flag"->"boolean",
    "address1"->"text",
    "address2"->"text",
    "city"->"text",
    "state"->"text",
    "zip5"->"text",
    "zip4"->"text",
    "county"->"text",
    "carrier_route"->"text",
    "dpbc"->"text",
    "latitude"->"float",
    "longitude"->"float",
    "street_pre_dir"->"text",
    "street_name"->"text",
    "street_post_dir"->"text",
    "street_suffix"->"text",
    "street_second_number"->"text",
    "street_second_unit"->"text",
    "street_house_num"->"text",
    "msa"->"text",
    "pmsa"->"text",
    "cbsa"->"text",
    "cbsa_type"->"text",
    "dpv"->"text",
    "county_code"->"text",
    "census_block"->"text",
    "census_tract"->"text",
    "locations"->"list<int>",
    "recipes"->"map<text,int>",
    "propensities"->"map<text,int>",
    "household_preference"->"int",
    "holdout_flag"->"boolean",
    "deceased_flag"->"boolean",
    "direct_mail_me"->"boolean",
    "direct_mail_me_reasons"->"set<text>",
    "call_me"->"boolean",
    "call_me_reasons"->"set<text>",
    "email_me"->"boolean",
    "email_me_reasons"->"set<text>",
    "text_me"->"boolean",
    "text_me_reasons"->"set<text>",
    "cmpids"->"set<text>",
    "listids"->"set<text>",
    "primary_care_physician"->"bigint",
    "has_primary_care_physician"->"boolean",
    "health_system_employee"->"boolean",
    "beehive_cluster"->"int",
    "data_source_id"->"int",
    "source_name"->"text",
    "purl"->"text"
  )

  val cleansedActivitySchemaMap = Map("customer" -> "text",
    "batch_id" -> "text",
    "bucket_number" -> "int",
    "activity_id" -> "text",
    "activity" -> "text",
    "activity_date" -> "timestamp",
    "activity_group" -> "text",
    "activity_group_id" -> "text",
    "activity_location" -> "text",
    "activity_location_id" -> "int",
    "activity_type" -> "text",
    "address1" -> "text",
    "address2" -> "text",
    "address_id" -> "text",
    "address_quality_indicator" -> "text",
    "address_status" -> "text",
    "address_type" -> "text",
    "admit_date" -> "date",
    "adults_in_living_unit" -> "int",
    "age" -> "int",
    "age_group" -> "text",
    "assessment_results" -> "map<text,text>",
    "attending_id" -> "text",
    "barcode" -> "text",
    "beehive_cluster" -> "int",
    "body_mass_index" -> "double",
    "business_unit" -> "text",
    "business_unit_id" -> "text",
    "call_me" -> "boolean",
    "call_me_reasons" -> "set<text>",
    "carrier_route" -> "text",
    "cass_stand" -> "text",
    "census_block" -> "text",
    "census_tract" -> "text",
    "charges" -> "decimal",
    "child_age_buckets" -> "set<text>",
    "child_four_to_six_bkt" -> "text",
    "child_seven_to_nine_bkt" -> "text",
    "child_sixteen_to_eighteen_bkt" -> "text",
    "child_ten_to_twelve_bkt" -> "text",
    "child_thirteen_to_fifteen_bkt" -> "text",
    "child_zero_to_three_bkt" -> "text",
    "children_in_living_unit" -> "int",
    "city" -> "text",
    "clinic" -> "text",
    "clinic_id" -> "text",
    "combined_owner" -> "text",
    "contribution_margin" -> "decimal",
    "core_based_statistical_area" -> "text",
    "core_based_statistical_area_type" -> "text",
    "cost" -> "decimal",
    "country" -> "text",
    "county" -> "text",
    "county_code" -> "text",
    "county_federal_information_processing_standards" -> "text",
    "current_procedural_terminology_codes" -> "map<text,text>",
    "customer_id" -> "int",
    "data_source_id" -> "int",
    "date_created" -> "timestamp",
    "date_modified" -> "timestamp",
    "date_of_birth" -> "date",
    "date_of_death" -> "date",
    "deceased_flag" -> "boolean",
    "delivery_point_barcode" -> "text",
    "delivery_point_code" -> "text",
    "delivery_point_validation" -> "text",
    "delivery_point_validation_footnote" -> "text",
    "diagnosis_codes" -> "map<text,text>",
    "diagnosis_service_line_1" -> "list<text>",
    "diagnosis_service_line_2" -> "list<text>",
    "diastolic" -> "double",
    "direct_mail_me" -> "boolean",
    "direct_mail_me_reasons" -> "set<text>",
    "discharge_date" -> "date",
    "discharge_status" -> "int",
    "donates_to_charity" -> "text",
    "dwell_type" -> "text",
    "education" -> "int",
    "email" -> "text",
    "email_me" -> "boolean",
    "email_me_reasons" -> "set<text>",
    "emails" -> "set<text>",
    "employer" -> "text",
    "employer_id" -> "text",
    "enhanced_line_of_travel" -> "text",
    "er_patient" -> "boolean",
    "estimated_home_value" -> "text",
    "ethnic_insight" -> "text",
    "exclusion_flag" -> "text",
    "facility" -> "text",
    "facility_id" -> "text",
    "final_bill_date" -> "date",
    "financial_class" -> "text",
    "financial_class_id" -> "int",
    "financial_class_id_orig" -> "text",
    "financial_class_orig" -> "text",
    "first_name" -> "text",
    "guarantor_address_1" -> "text",
    "guarantor_address_2" -> "text",
    "guarantor_city" -> "text",
    "guarantor_country" -> "text",
    "guarantor_first_name" -> "text",
    "guarantor_full_name" -> "text",
    "guarantor_last_name" -> "text",
    "guarantor_middle_name" -> "text",
    "guarantor_state" -> "text",
    "guarantor_zip_5" -> "text",
    "has_primary_care_physician" -> "boolean",
    "health_system_employee" -> "boolean",
    "height" -> "double",
    "holdout_flag" -> "boolean",
    "home_land_value" -> "float",
    "home_phone" -> "text",
    "home_year_built" -> "int",
    "hospital" -> "text",
    "hospital_id" -> "text",
    "household_composition" -> "text",
    "household_id" -> "text",
    "household_income" -> "text",
    "household_preference" -> "int",
    "inferred_payer_type" -> "text",
    "insurance" -> "text",
    "insurance_id" -> "text",
    "lacs" -> "text",
    "language" -> "text",
    "last_name" -> "text",
    "latitude" -> "text",
    "length_of_residence" -> "int",
    "length_of_stay" -> "int",
    "llk_footnote" -> "text",
    "location_id" -> "int",
    "locations" -> "set<int>",
    "longitude" -> "text",
    "mail_responder" -> "text",
    "marital_status" -> "text",
    "medical_codes" -> "list<text>",
    "medical_groups" -> "set<int>",
    "medical_severity_diagnosis_related_group" -> "int",
    "medical_severity_diagnosis_related_group_detail_level" -> "list<text>",
    "medical_severity_diagnosis_related_group_service_line" -> "list<text>",
    "medical_severity_diagnosis_related_group_sub_service_line" -> "list<text>",
    "message_type" -> "text",
    "metropolitan_statistical_area" -> "text",
    "middle_name" -> "text",
    "mobile_phone" -> "text",
    "mosaic_global_zip_4" -> "text",
    "mosaic_zip_4" -> "text",
    "move_type" -> "text",
    "moved_from_zip_5" -> "text",
    "moved_to_zip_5" -> "text",
    "mrids" -> "set<text>",
    "ncoa_action_code" -> "text",
    "ncoa_anklink_code" -> "text",
    "ncoa_move_date" -> "text",
    "ncoa_move_type" -> "text",
    "occupation" -> "text",
    "occupation_group" -> "text",
    "patient_type" -> "text",
    "payer_type" -> "text",
    "person_id" -> "text",
    "person_type" -> "text",
    "personal_suffix" -> "text",
    "personal_url" -> "text",
    "persons_in_living_unit" -> "int",
    "phone_numbers" -> "set<text>",
    "physician_first_name" -> "text",
    "physician_full_name" -> "text",
    "physician_last_name" -> "text",
    "physician_middle_name" -> "text",
    "physician_national_provider_identifier" -> "text",
    "physician_personal_suffix" -> "text",
    "physician_primary_speciality" -> "text",
    "physician_primary_speciality_code" -> "text",
    "physician_professional_suffix" -> "text",
    "portal_status" -> "text",
    "practice_location" -> "text",
    "practice_location_id" -> "text",
    "prefix" -> "text",
    "presence_of_child" -> "text",
    "primary_care_physician" -> "bigint",
    "primary_care_physician_id" -> "text",
    "primary_email" -> "text",
    "primary_metropolitan_statistical_area" -> "text",
    "primary_phone_number" -> "text",
    "primary_phone_number_type" -> "text",
    "primary_service_line" -> "list<text>",
    "procedure_service_line_1" -> "list<text>",
    "procedure_service_line_2" -> "list<text>",
    "procedure_service_line_3" -> "list<text>",
    "professional_suffix" -> "text",
    "profit" -> "decimal",
    "prognosis_codes" -> "map<text,text>",
    "providers" -> "set<text>",
    "race" -> "text",
    "reason" -> "text",
    "reason_id" -> "text",
    "recipient_reliability_code" -> "int",
    "referencing_id" -> "text",
    "religion" -> "text",
    "revenue" -> "decimal",
    "service_lines" -> "set<text>",
    "sex" -> "text",
    "site" -> "text",
    "site_id" -> "text",
    "source" -> "text",
    "source_activity_type" -> "text",
    "source_client" -> "text",
    "source_discharge_status" -> "text",
    "source_dns_reason" -> "text",
    "source_er_patient" -> "text",
    "source_exclusion_flag" -> "text",
    "source_financial_class" -> "text",
    "source_financial_class_id" -> "text",
    "source_marital_status" -> "text",
    "source_name" -> "text",
    "source_patient_type" -> "text",
    "source_person_id" -> "text",
    "source_race" -> "text",
    "source_record_id" -> "text",
    "source_sex" -> "text",
    "source_type" -> "text",
    "state" -> "text",
    "street_house_number" -> "text",
    "street_name" -> "text",
    "street_post_direction" -> "text",
    "street_pre_direction" -> "text",
    "street_second_number" -> "text",
    "street_second_unit" -> "text",
    "street_suffix" -> "text",
    "systolic" -> "double",
    "text_me" -> "boolean",
    "text_me_reasons" -> "set<text>",
    "valid_address_flag" -> "boolean",
    "visit_total_charges" -> "decimal",
    "wealth_rating" -> "int",
    "weight" -> "double",
    "work_phone" -> "text",
    "zip" -> "text",
    "zip4" -> "text",
    "zip5" -> "text")
}
