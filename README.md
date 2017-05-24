# time api
This api is made for project Cluster & SmartMirror, it is designed to run on a raspberry pi in a docker container. 
the application uses a tomcat server in order to work, the default port is 8080. 
make sure to setup a tomcat server if you havent already. 
this is a RESTfull api which will return the current time in JSON format including the hour,minute, second, day, day_of_month, month and year.

# setup tomcat server
https://www.jetbrains.com/help/idea/2017.1/creating-and-running-your-first-web-application.html

# Examples

connect to the application(should start when you run the application): 
{ip_cluster}:{port_api}/
http://localhost:8080/

to get the default time
{ip_cluster}:{poort_api}/time 
http://localhost:8080/time

to get the time of a specific time zone
{ip_cluster}:{port_api}/time/{Continent}/{Area} 
http://localhost:8080/time/Asia/Seoul

a list of all supported time zones:


CC*	Coordinates*	TZ*	Comments*	UTC offset	UTC DST offset	Notes
CI	+0519-00402	Africa/Abidjan		+00:00	+00:00	
GH	+0533-00013	Africa/Accra		+00:00	+00:00	
ET	+0902+03842	Africa/Addis_Ababa		+03:00	+03:00	Link to Africa/Nairobi
DZ	+3647+00303	Africa/Algiers		+01:00	+01:00	
ER	+1520+03853	Africa/Asmara		+03:00	+03:00	Link to Africa/Nairobi
Africa/Asmera		+03:00	+03:00	Link to Africa/Nairobi
ML	+1239-00800	Africa/Bamako		+00:00	+00:00	Link to Africa/Abidjan
CF	+0422+01835	Africa/Bangui		+01:00	+01:00	Link to Africa/Lagos
GM	+1328-01639	Africa/Banjul		+00:00	+00:00	Link to Africa/Abidjan
GW	+1151-01535	Africa/Bissau		+00:00	+00:00	
MW	-1547+03500	Africa/Blantyre		+02:00	+02:00	Link to Africa/Maputo
CG	-0416+01517	Africa/Brazzaville		+01:00	+01:00	Link to Africa/Lagos
BI	-0323+02922	Africa/Bujumbura		+02:00	+02:00	Link to Africa/Maputo
EG	+3003+03115	Africa/Cairo		+02:00	+02:00	
MA	+3339-00735	Africa/Casablanca		+00:00	+01:00	
ES	+3553-00519	Africa/Ceuta	Ceuta, Melilla	+01:00	+02:00	
GN	+0931-01343	Africa/Conakry		+00:00	+00:00	Link to Africa/Abidjan
SN	+1440-01726	Africa/Dakar		+00:00	+00:00	Link to Africa/Abidjan
TZ	-0648+03917	Africa/Dar_es_Salaam		+03:00	+03:00	Link to Africa/Nairobi
DJ	+1136+04309	Africa/Djibouti		+03:00	+03:00	Link to Africa/Nairobi
CM	+0403+00942	Africa/Douala		+01:00	+01:00	Link to Africa/Lagos
EH	+2709-01312	Africa/El_Aaiun		+00:00	+01:00	
SL	+0830-01315	Africa/Freetown		+00:00	+00:00	Link to Africa/Abidjan
BW	-2439+02555	Africa/Gaborone		+02:00	+02:00	Link to Africa/Maputo
ZW	-1750+03103	Africa/Harare		+02:00	+02:00	Link to Africa/Maputo
ZA	-2615+02800	Africa/Johannesburg		+02:00	+02:00	
SS	+0451+03136	Africa/Juba		+03:00	+03:00	Link to Africa/Khartoum
UG	+0019+03225	Africa/Kampala		+03:00	+03:00	Link to Africa/Nairobi
SD	+1536+03232	Africa/Khartoum		+03:00	+03:00	
RW	-0157+03004	Africa/Kigali		+02:00	+02:00	Link to Africa/Maputo
CD	-0418+01518	Africa/Kinshasa	Dem. Rep. of Congo (west)	+01:00	+01:00	Link to Africa/Lagos
NG	+0627+00324	Africa/Lagos		+01:00	+01:00	
GA	+0023+00927	Africa/Libreville		+01:00	+01:00	Link to Africa/Lagos
TG	+0608+00113	Africa/Lome		+00:00	+00:00	Link to Africa/Abidjan
AO	-0848+01314	Africa/Luanda		+01:00	+01:00	Link to Africa/Lagos
CD	-1140+02728	Africa/Lubumbashi	Dem. Rep. of Congo (east)	+02:00	+02:00	Link to Africa/Maputo
ZM	-1525+02817	Africa/Lusaka		+02:00	+02:00	Link to Africa/Maputo
GQ	+0345+00847	Africa/Malabo		+01:00	+01:00	Link to Africa/Lagos
MZ	-2558+03235	Africa/Maputo		+02:00	+02:00	
LS	-2928+02730	Africa/Maseru		+02:00	+02:00	Link to Africa/Johannesburg
SZ	-2618+03106	Africa/Mbabane		+02:00	+02:00	Link to Africa/Johannesburg
SO	+0204+04522	Africa/Mogadishu		+03:00	+03:00	Link to Africa/Nairobi
LR	+0618-01047	Africa/Monrovia		+00:00	+00:00	
KE	-0117+03649	Africa/Nairobi		+03:00	+03:00	
TD	+1207+01503	Africa/Ndjamena		+01:00	+01:00	
NE	+1331+00207	Africa/Niamey		+01:00	+01:00	Link to Africa/Lagos
MR	+1806-01557	Africa/Nouakchott		+00:00	+00:00	Link to Africa/Abidjan
BF	+1222-00131	Africa/Ouagadougou		+00:00	+00:00	Link to Africa/Abidjan
BJ	+0629+00237	Africa/Porto-Novo		+01:00	+01:00	Link to Africa/Lagos
ST	+0020+00644	Africa/Sao_Tome		+00:00	+00:00	Link to Africa/Abidjan
Africa/Timbuktu		+00:00	+00:00	Link to Africa/Abidjan
LY	+3254+01311	Africa/Tripoli		+02:00	+02:00	
TN	+3648+01011	Africa/Tunis		+01:00	+01:00	
NA	-2234+01706	Africa/Windhoek		+01:00	+02:00	
US	+515248-1763929	America/Adak	Aleutian Islands	-10:00	-09:00	
US	+611305-1495401	America/Anchorage	Alaska (most areas)	-09:00	-08:00	
AI	+1812-06304	America/Anguilla		-04:00	-04:00	Link to America/Port_of_Spain
AG	+1703-06148	America/Antigua		-04:00	-04:00	Link to America/Port_of_Spain
BR	-0712-04812	America/Araguaina	Tocantins	-03:00	-03:00	
AR	-3436-05827	America/Argentina/Buenos_Aires	Buenos Aires (BA, CF)	-03:00	-03:00	
AR	-2828-06547	America/Argentina/Catamarca	Catamarca (CT); Chubut (CH)	-03:00	-03:00	
America/Argentina/ComodRivadavia		-03:00	-03:00	Link to America/Argentina/Catamarca
AR	-3124-06411	America/Argentina/Cordoba	Argentina (most areas: CB, CC, CN, ER, FM, MN, SE, SF)	-03:00	-03:00	
AR	-2411-06518	America/Argentina/Jujuy	Jujuy (JY)	-03:00	-03:00	
AR	-2926-06651	America/Argentina/La_Rioja	La Rioja (LR)	-03:00	-03:00	
AR	-3253-06849	America/Argentina/Mendoza	Mendoza (MZ)	-03:00	-03:00	
AR	-5138-06913	America/Argentina/Rio_Gallegos	Santa Cruz (SC)	-03:00	-03:00	
AR	-2447-06525	America/Argentina/Salta	Salta (SA, LP, NQ, RN)	-03:00	-03:00	
AR	-3132-06831	America/Argentina/San_Juan	San Juan (SJ)	-03:00	-03:00	
AR	-3319-06621	America/Argentina/San_Luis	San Luis (SL)	-03:00	-03:00	
AR	-2649-06513	America/Argentina/Tucuman	Tucuman (TM)	-03:00	-03:00	
AR	-5448-06818	America/Argentina/Ushuaia	Tierra del Fuego (TF)	-03:00	-03:00	
AW	+1230-06958	America/Aruba		-04:00	-04:00	Link to America/Curacao
PY	-2516-05740	America/Asuncion		-04:00	-03:00	
CA	+484531-0913718	America/Atikokan	EST - ON (Atikokan); NU (Coral H)	-05:00	-05:00	
America/Atka		-10:00	-09:00	Link to America/Adak
BR	-1259-03831	America/Bahia	Bahia	-03:00	-03:00	
MX	+2048-10515	America/Bahia_Banderas	Central Time - Bahia de Banderas	-06:00	-05:00	
BB	+1306-05937	America/Barbados		-04:00	-04:00	
BR	-0127-04829	America/Belem	Para (east); Amapa	-03:00	-03:00	
BZ	+1730-08812	America/Belize		-06:00	-06:00	
CA	+5125-05707	America/Blanc-Sablon	AST - QC (Lower North Shore)	-04:00	-04:00	
BR	+0249-06040	America/Boa_Vista	Roraima	-04:00	-04:00	
CO	+0436-07405	America/Bogota		-05:00	-05:00	
US	+433649-1161209	America/Boise	Mountain - ID (south); OR (east)	-07:00	-06:00	
America/Buenos_Aires		-03:00	-03:00	Link to America/Argentina/Buenos_Aires
CA	+690650-1050310	America/Cambridge_Bay	Mountain - NU (west)	-07:00	-06:00	
BR	-2027-05437	America/Campo_Grande	Mato Grosso do Sul	-04:00	-03:00	
MX	+2105-08646	America/Cancun	Eastern Standard Time - Quintana Roo	-05:00	-05:00	
VE	+1030-06656	America/Caracas		-04:00	-04:00	
America/Catamarca		-03:00	-03:00	Link to America/Argentina/Catamarca
GF	+0456-05220	America/Cayenne		-03:00	-03:00	
KY	+1918-08123	America/Cayman		-05:00	-05:00	Link to America/Panama
US	+4151-08739	America/Chicago	Central (most areas)	-06:00	-05:00	
MX	+2838-10605	America/Chihuahua	Mountain Time - Chihuahua (most areas)	-07:00	-06:00	
America/Coral_Harbour		-05:00	-05:00	Link to America/Atikokan
America/Cordoba		-03:00	-03:00	Link to America/Argentina/Cordoba
CR	+0956-08405	America/Costa_Rica		-06:00	-06:00	
CA	+4906-11631	America/Creston	MST - BC (Creston)	-07:00	-07:00	
BR	-1535-05605	America/Cuiaba	Mato Grosso	-04:00	-03:00	
CW	+1211-06900	America/Curacao		-04:00	-04:00	
GL	+7646-01840	America/Danmarkshavn	National Park (east coast)	+00:00	+00:00	
CA	+6404-13925	America/Dawson	Pacific - Yukon (north)	-08:00	-07:00	
CA	+5946-12014	America/Dawson_Creek	MST - BC (Dawson Cr, Ft St John)	-07:00	-07:00	
US	+394421-1045903	America/Denver	Mountain (most areas)	-07:00	-06:00	
US	+421953-0830245	America/Detroit	Eastern - MI (most areas)	-05:00	-04:00	
DM	+1518-06124	America/Dominica		-04:00	-04:00	Link to America/Port_of_Spain
CA	+5333-11328	America/Edmonton	Mountain - AB; BC (E); SK (W)	-07:00	-06:00	
BR	-0640-06952	America/Eirunepe	Amazonas (west)	-05:00	-05:00	
SV	+1342-08912	America/El_Salvador		-06:00	-06:00	
America/Ensenada		-08:00	-07:00	Link to America/Tijuana
CA	+5848-12242	America/Fort_Nelson	MST - BC (Ft Nelson)	-07:00	-07:00	
America/Fort_Wayne		-05:00	-04:00	Link to America/Indiana/Indianapolis
BR	-0343-03830	America/Fortaleza	Brazil (northeast: MA, PI, CE, RN, PB)	-03:00	-03:00	
CA	+4612-05957	America/Glace_Bay	Atlantic - NS (Cape Breton)	-04:00	-03:00	
GL	+6411-05144	America/Godthab	Greenland (most areas)	-03:00	-02:00	
CA	+5320-06025	America/Goose_Bay	Atlantic - Labrador (most areas)	-04:00	-03:00	
TC	+2128-07108	America/Grand_Turk		-04:00	-04:00	
GD	+1203-06145	America/Grenada		-04:00	-04:00	Link to America/Port_of_Spain
GP	+1614-06132	America/Guadeloupe		-04:00	-04:00	Link to America/Port_of_Spain
GT	+1438-09031	America/Guatemala		-06:00	-06:00	
EC	-0210-07950	America/Guayaquil	Ecuador (mainland)	-05:00	-05:00	
GY	+0648-05810	America/Guyana		-04:00	-04:00	
CA	+4439-06336	America/Halifax	Atlantic - NS (most areas); PE	-04:00	-03:00	
CU	+2308-08222	America/Havana		-05:00	-04:00	
MX	+2904-11058	America/Hermosillo	Mountain Standard Time - Sonora	-07:00	-07:00	
US	+394606-0860929	America/Indiana/Indianapolis	Eastern - IN (most areas)	-05:00	-04:00	
US	+411745-0863730	America/Indiana/Knox	Central - IN (Starke)	-06:00	-05:00	
US	+382232-0862041	America/Indiana/Marengo	Eastern - IN (Crawford)	-05:00	-04:00	
US	+382931-0871643	America/Indiana/Petersburg	Eastern - IN (Pike)	-05:00	-04:00	
US	+375711-0864541	America/Indiana/Tell_City	Central - IN (Perry)	-06:00	-05:00	
US	+384452-0850402	America/Indiana/Vevay	Eastern - IN (Switzerland)	-05:00	-04:00	
US	+384038-0873143	America/Indiana/Vincennes	Eastern - IN (Da, Du, K, Mn)	-05:00	-04:00	
US	+410305-0863611	America/Indiana/Winamac	Eastern - IN (Pulaski)	-05:00	-04:00	
America/Indianapolis		-05:00	-04:00	Link to America/Indiana/Indianapolis
CA	+682059-13343	America/Inuvik	Mountain - NT (west)	-07:00	-06:00	
CA	+6344-06828	America/Iqaluit	Eastern - NU (most east areas)	-05:00	-04:00	
JM	+175805-0764736	America/Jamaica		-05:00	-05:00	
America/Jujuy		-03:00	-03:00	Link to America/Argentina/Jujuy
US	+581807-1342511	America/Juneau	Alaska - Juneau area	-09:00	-08:00	
US	+381515-0854534	America/Kentucky/Louisville	Eastern - KY (Louisville area)	-05:00	-04:00	
US	+364947-0845057	America/Kentucky/Monticello	Eastern - KY (Wayne)	-05:00	-04:00	
America/Knox_IN		-06:00	-05:00	Link to America/Indiana/Knox
BQ	+120903-0681636	America/Kralendijk		-04:00	-04:00	Link to America/Curacao
BO	-1630-06809	America/La_Paz		-04:00	-04:00	
PE	-1203-07703	America/Lima		-05:00	-05:00	
US	+340308-1181434	America/Los_Angeles	Pacific	-08:00	-07:00	
America/Louisville		-05:00	-04:00	Link to America/Kentucky/Louisville
SX	+180305-0630250	America/Lower_Princes		-04:00	-04:00	Link to America/Curacao
BR	-0940-03543	America/Maceio	Alagoas, Sergipe	-03:00	-03:00	
NI	+1209-08617	America/Managua		-06:00	-06:00	
BR	-0308-06001	America/Manaus	Amazonas (east)	-04:00	-04:00	
MF	+1804-06305	America/Marigot		-04:00	-04:00	Link to America/Port_of_Spain
MQ	+1436-06105	America/Martinique		-04:00	-04:00	
MX	+2550-09730	America/Matamoros	Central Time US - Coahuila, Nuevo Leon, Tamaulipas (US border)	-06:00	-05:00	
MX	+2313-10625	America/Mazatlan	Mountain Time - Baja California Sur, Nayarit, Sinaloa	-07:00	-06:00	
America/Mendoza		-03:00	-03:00	Link to America/Argentina/Mendoza
US	+450628-0873651	America/Menominee	Central - MI (Wisconsin border)	-06:00	-05:00	
MX	+2058-08937	America/Merida	Central Time - Campeche, Yucatan	-06:00	-05:00	
US	+550737-1313435	America/Metlakatla	Alaska - Annette Island	-09:00	-08:00	
MX	+1924-09909	America/Mexico_City	Central Time	-06:00	-05:00	
PM	+4703-05620	America/Miquelon		-03:00	-02:00	
CA	+4606-06447	America/Moncton	Atlantic - New Brunswick	-04:00	-03:00	
MX	+2540-10019	America/Monterrey	Central Time - Durango; Coahuila, Nuevo Leon, Tamaulipas (most areas)	-06:00	-05:00	
UY	-3453-05611	America/Montevideo		-03:00	-03:00	
America/Montreal		-05:00	-04:00	Link to America/Toronto
MS	+1643-06213	America/Montserrat		-04:00	-04:00	Link to America/Port_of_Spain
BS	+2505-07721	America/Nassau		-05:00	-04:00	
US	+404251-0740023	America/New_York	Eastern (most areas)	-05:00	-04:00	
CA	+4901-08816	America/Nipigon	Eastern - ON, QC (no DST 1967-73)	-05:00	-04:00	
US	+643004-1652423	America/Nome	Alaska (west)	-09:00	-08:00	
BR	-0351-03225	America/Noronha	Atlantic islands	-02:00	-02:00	
US	+471551-1014640	America/North_Dakota/Beulah	Central - ND (Mercer)	-06:00	-05:00	
US	+470659-1011757	America/North_Dakota/Center	Central - ND (Oliver)	-06:00	-05:00	
US	+465042-1012439	America/North_Dakota/New_Salem	Central - ND (Morton rural)	-06:00	-05:00	
MX	+2934-10425	America/Ojinaga	Mountain Time US - Chihuahua (US border)	-07:00	-06:00	
PA	+0858-07932	America/Panama		-05:00	-05:00	
CA	+6608-06544	America/Pangnirtung	Eastern - NU (Pangnirtung)	-05:00	-04:00	
SR	+0550-05510	America/Paramaribo		-03:00	-03:00	
US	+332654-1120424	America/Phoenix	MST - Arizona (except Navajo)	-07:00	-07:00	
TT	+1039-06131	America/Port_of_Spain		-04:00	-04:00	
HT	+1832-07220	America/Port-au-Prince		-05:00	-04:00	
America/Porto_Acre		-05:00	-05:00	Link to America/Rio_Branco
BR	-0846-06354	America/Porto_Velho	Rondonia	-04:00	-04:00	
PR	+182806-0660622	America/Puerto_Rico		-04:00	-04:00	
CL	-5309-07055	America/Punta_Arenas	Magallanes and Chilean Antarctica Region	-03:00	-03:00	
CA	+4843-09434	America/Rainy_River	Central - ON (Rainy R, Ft Frances)	-06:00	-05:00	
CA	+6249-0920459	America/Rankin_Inlet	Central - NU (central)	-06:00	-05:00	
BR	-0803-03454	America/Recife	Pernambuco	-03:00	-03:00	
CA	+5024-10439	America/Regina	CST - SK (most areas)	-06:00	-06:00	
CA	+744144-0944945	America/Resolute	Central - NU (Resolute)	-06:00	-05:00	
BR	-0958-06748	America/Rio_Branco	Acre	-05:00	-05:00	
America/Rosario		-03:00	-03:00	Link to America/Argentina/Cordoba
America/Santa_Isabel		-08:00	-07:00	Link to America/Tijuana
BR	-0226-05452	America/Santarem	Para (west)	-03:00	-03:00	
CL	-3327-07040	America/Santiago	Chile (most areas)	-04:00	-03:00	
DO	+1828-06954	America/Santo_Domingo		-04:00	-04:00	
BR	-2332-04637	America/Sao_Paulo	Brazil (southeast: GO, DF, MG, ES, RJ, SP, PR, SC, RS)	-03:00	-02:00	
GL	+7029-02158	America/Scoresbysund	Scoresbysund/Ittoqqortoormiit	-01:00	+00:00	
America/Shiprock		-07:00	-06:00	Link to America/Denver
US	+571035-1351807	America/Sitka	Alaska - Sitka area	-09:00	-08:00	
BL	+1753-06251	America/St_Barthelemy		-04:00	-04:00	Link to America/Port_of_Spain
CA	+4734-05243	America/St_Johns	Newfoundland; Labrador (southeast)	-03:30	-02:30	
KN	+1718-06243	America/St_Kitts		-04:00	-04:00	Link to America/Port_of_Spain
LC	+1401-06100	America/St_Lucia		-04:00	-04:00	Link to America/Port_of_Spain
VI	+1821-06456	America/St_Thomas		-04:00	-04:00	Link to America/Port_of_Spain
VC	+1309-06114	America/St_Vincent		-04:00	-04:00	Link to America/Port_of_Spain
CA	+5017-10750	America/Swift_Current	CST - SK (midwest)	-06:00	-06:00	
HN	+1406-08713	America/Tegucigalpa		-06:00	-06:00	
GL	+7634-06847	America/Thule	Thule/Pituffik	-04:00	-03:00	
CA	+4823-08915	America/Thunder_Bay	Eastern - ON (Thunder Bay)	-05:00	-04:00	
MX	+3232-11701	America/Tijuana	Pacific Time US - Baja California	-08:00	-07:00	
CA	+4339-07923	America/Toronto	Eastern - ON, QC (most areas)	-05:00	-04:00	
VG	+1827-06437	America/Tortola		-04:00	-04:00	Link to America/Port_of_Spain
CA	+4916-12307	America/Vancouver	Pacific - BC (most areas)	-08:00	-07:00	
America/Virgin		-04:00	-04:00	Link to America/Port_of_Spain
CA	+6043-13503	America/Whitehorse	Pacific - Yukon (south)	-08:00	-07:00	
CA	+4953-09709	America/Winnipeg	Central - ON (west); Manitoba	-06:00	-05:00	
US	+593249-1394338	America/Yakutat	Alaska - Yakutat	-09:00	-08:00	
CA	+6227-11421	America/Yellowknife	Mountain - NT (central)	-07:00	-06:00	
AQ	-6617+11031	Antarctica/Casey	Casey	+11:00	+11:00	
AQ	-6835+07758	Antarctica/Davis	Davis	+07:00	+07:00	
AQ	-6640+14001	Antarctica/DumontDUrville	Dumont-d'Urville	+10:00	+10:00	
AU	-5430+15857	Antarctica/Macquarie	Macquarie Island	+11:00	+11:00	
AQ	-6736+06253	Antarctica/Mawson	Mawson	+05:00	+05:00	
AQ	-7750+16636	Antarctica/McMurdo	New Zealand time - McMurdo, South Pole	+12:00	+13:00	Link to Pacific/Auckland
AQ	-6448-06406	Antarctica/Palmer	Palmer	-03:00	-03:00	
AQ	-6734-06808	Antarctica/Rothera	Rothera	-03:00	-03:00	
Antarctica/South_Pole		+12:00	+13:00	Link to Pacific/Auckland
AQ	-690022+0393524	Antarctica/Syowa	Syowa	+03:00	+03:00	
AQ	-720041+0023206	Antarctica/Troll	Troll	+00:00	+02:00	Also uses +01:00 for a brief period between standard and daylight time.[1]
AQ	-7824+10654	Antarctica/Vostok	Vostok	+06:00	+06:00	
SJ	+7800+01600	Arctic/Longyearbyen		+01:00	+02:00	Link to Europe/Oslo
YE	+1245+04512	Asia/Aden		+03:00	+03:00	Link to Asia/Riyadh
KZ	+4315+07657	Asia/Almaty	Kazakhstan (most areas)	+06:00	+06:00	
JO	+3157+03556	Asia/Amman		+02:00	+03:00	
RU	+6445+17729	Asia/Anadyr	MSK+09 - Bering Sea	+12:00	+12:00	
KZ	+4431+05016	Asia/Aqtau	Mangghystau/Mankistau	+05:00	+05:00	
KZ	+5017+05710	Asia/Aqtobe	Aqtobe/Aktobe	+05:00	+05:00	
TM	+3757+05823	Asia/Ashgabat		+05:00	+05:00	
Asia/Ashkhabad		+05:00	+05:00	Link to Asia/Ashgabat
KZ	+4707+05156	Asia/Atyrau	Atyrau/Atirau/Gur'yev	+05:00	+05:00	
IQ	+3321+04425	Asia/Baghdad		+03:00	+03:00	
BH	+2623+05035	Asia/Bahrain		+03:00	+03:00	Link to Asia/Qatar
AZ	+4023+04951	Asia/Baku		+04:00	+04:00	
TH	+1345+10031	Asia/Bangkok		+07:00	+07:00	
RU	+5322+08345	Asia/Barnaul	MSK+04 - Altai	+07:00	+07:00	
LB	+3353+03530	Asia/Beirut		+02:00	+03:00	
KG	+4254+07436	Asia/Bishkek		+06:00	+06:00	
BN	+0456+11455	Asia/Brunei		+08:00	+08:00	
Asia/Calcutta		+05:30	+05:30	Link to Asia/Kolkata
RU	+5203+11328	Asia/Chita	MSK+06 - Zabaykalsky	+09:00	+09:00	
MN	+4804+11430	Asia/Choibalsan	Dornod, Sukhbaatar	+08:00	+08:00	
Asia/Chongqing		+08:00	+08:00	Link to Asia/Shanghai
Asia/Chungking		+08:00	+08:00	Link to Asia/Shanghai
LK	+0656+07951	Asia/Colombo		+05:30	+05:30	
Asia/Dacca		+06:00	+06:00	Link to Asia/Dhaka
SY	+3330+03618	Asia/Damascus		+02:00	+03:00	
BD	+2343+09025	Asia/Dhaka		+06:00	+06:00	
TL	-0833+12535	Asia/Dili		+09:00	+09:00	
AE	+2518+05518	Asia/Dubai		+04:00	+04:00	
TJ	+3835+06848	Asia/Dushanbe		+05:00	+05:00	
CY	+3507+03357	Asia/Famagusta	Northern Cyprus	+03:00	+03:00	
PS	+3130+03428	Asia/Gaza	Gaza Strip	+02:00	+03:00	
Asia/Harbin		+08:00	+08:00	Link to Asia/Shanghai
PS	+3132+0350542	Asia/Hebron	West Bank	+02:00	+03:00	
VN	+1045+10640	Asia/Ho_Chi_Minh		+07:00	+07:00	
HK	+2217+11409	Asia/Hong_Kong		+08:00	+08:00	
MN	+4801+09139	Asia/Hovd	Bayan-Olgiy, Govi-Altai, Hovd, Uvs, Zavkhan	+07:00	+07:00	
RU	+5216+10420	Asia/Irkutsk	MSK+05 - Irkutsk, Buryatia	+08:00	+08:00	
Asia/Istanbul		+03:00	+03:00	Link to Europe/Istanbul
ID	-0610+10648	Asia/Jakarta	Java, Sumatra	+07:00	+07:00	
ID	-0232+14042	Asia/Jayapura	New Guinea (West Papua / Irian Jaya); Malukus/Moluccas	+09:00	+09:00	
IL	+314650+0351326	Asia/Jerusalem		+02:00	+03:00	
AF	+3431+06912	Asia/Kabul		+04:30	+04:30	
RU	+5301+15839	Asia/Kamchatka	MSK+09 - Kamchatka	+12:00	+12:00	
PK	+2452+06703	Asia/Karachi		+05:00	+05:00	
Asia/Kashgar		+06:00	+06:00	Link to Asia/Urumqi[note 1]
NP	+2743+08519	Asia/Kathmandu		+05:45	+05:45	
Asia/Katmandu		+05:45	+05:45	Link to Asia/Kathmandu
RU	+623923+1353314	Asia/Khandyga	MSK+06 - Tomponsky, Ust-Maysky	+09:00	+09:00	
IN	+2232+08822	Asia/Kolkata		+05:30	+05:30	Note: Different zones in history, see Time in India.
RU	+5601+09250	Asia/Krasnoyarsk	MSK+04 - Krasnoyarsk area	+07:00	+07:00	
MY	+0310+10142	Asia/Kuala_Lumpur	Malaysia (peninsula)	+08:00	+08:00	
MY	+0133+11020	Asia/Kuching	Sabah, Sarawak	+08:00	+08:00	
KW	+2920+04759	Asia/Kuwait		+03:00	+03:00	Link to Asia/Riyadh
Asia/Macao		+08:00	+08:00	Link to Asia/Macau
MO	+2214+11335	Asia/Macau		+08:00	+08:00	
RU	+5934+15048	Asia/Magadan	MSK+08 - Magadan	+11:00	+11:00	
ID	-0507+11924	Asia/Makassar	Borneo (east, south); Sulawesi/Celebes, Bali, Nusa Tengarra; Timor (west)	+08:00	+08:00	
PH	+1435+12100	Asia/Manila		+08:00	+08:00	
OM	+2336+05835	Asia/Muscat		+04:00	+04:00	Link to Asia/Dubai
CY	+3510+03322	Asia/Nicosia	Cyprus (most areas)	+02:00	+03:00	
RU	+5345+08707	Asia/Novokuznetsk	MSK+04 - Kemerovo	+07:00	+07:00	
RU	+5502+08255	Asia/Novosibirsk	MSK+04 - Novosibirsk	+07:00	+07:00	
RU	+5500+07324	Asia/Omsk	MSK+03 - Omsk	+06:00	+06:00	
KZ	+5113+05121	Asia/Oral	West Kazakhstan	+05:00	+05:00	
KH	+1133+10455	Asia/Phnom_Penh		+07:00	+07:00	Link to Asia/Bangkok
ID	-0002+10920	Asia/Pontianak	Borneo (west, central)	+07:00	+07:00	
KP	+3901+12545	Asia/Pyongyang		+08:30	+08:30	
QA	+2517+05132	Asia/Qatar		+03:00	+03:00	
KZ	+4448+06528	Asia/Qyzylorda	Qyzylorda/Kyzylorda/Kzyl-Orda	+06:00	+06:00	
Asia/Rangoon		+06:30	+06:30	Link to Asia/Yangon
SA	+2438+04643	Asia/Riyadh		+03:00	+03:00	
Asia/Saigon		+07:00	+07:00	Link to Asia/Ho_Chi_Minh
RU	+4658+14242	Asia/Sakhalin	MSK+08 - Sakhalin Island	+11:00	+11:00	
UZ	+3940+06648	Asia/Samarkand	Uzbekistan (west)	+05:00	+05:00	
KR	+3733+12658	Asia/Seoul		+09:00	+09:00	
CN	+3114+12128	Asia/Shanghai	Beijing Time	+08:00	+08:00	Covering historic Chungyuan time zone.
SG	+0117+10351	Asia/Singapore		+08:00	+08:00	
RU	+6728+15343	Asia/Srednekolymsk	MSK+08 - Sakha (E); North Kuril Is	+11:00	+11:00	
TW	+2503+12130	Asia/Taipei		+08:00	+08:00	
UZ	+4120+06918	Asia/Tashkent	Uzbekistan (east)	+05:00	+05:00	
GE	+4143+04449	Asia/Tbilisi		+04:00	+04:00	
IR	+3540+05126	Asia/Tehran		+03:30	+04:30	
Asia/Tel_Aviv		+02:00	+03:00	Link to Asia/Jerusalem
Asia/Thimbu		+06:00	+06:00	Link to Asia/Thimphu
BT	+2728+08939	Asia/Thimphu		+06:00	+06:00	
JP	+353916+1394441	Asia/Tokyo		+09:00	+09:00	
RU	+5630+08458	Asia/Tomsk	MSK+04 - Tomsk	+07:00	+07:00	
Asia/Ujung_Pandang		+08:00	+08:00	Link to Asia/Makassar
MN	+4755+10653	Asia/Ulaanbaatar	Mongolia (most areas)	+08:00	+08:00	
Asia/Ulan_Bator		+08:00	+08:00	Link to Asia/Ulaanbaatar
CN	+4348+08735	Asia/Urumqi	Xinjiang Time	+06:00	+06:00	Covering historic Sinkiang-Tibet time zone.[note 2]
RU	+643337+1431336	Asia/Ust-Nera	MSK+07 - Oymyakonsky	+10:00	+10:00	
LA	+1758+10236	Asia/Vientiane		+07:00	+07:00	Link to Asia/Bangkok
RU	+4310+13156	Asia/Vladivostok	MSK+07 - Amur River	+10:00	+10:00	
RU	+6200+12940	Asia/Yakutsk	MSK+06 - Lena River	+09:00	+09:00	
MM	+1647+09610	Asia/Yangon		+06:30	+06:30	
RU	+5651+06036	Asia/Yekaterinburg	MSK+02 - Urals	+05:00	+05:00	
AM	+4011+04430	Asia/Yerevan		+04:00	+04:00	
PT	+3744-02540	Atlantic/Azores	Azores	-01:00	+00:00	
BM	+3217-06446	Atlantic/Bermuda		-04:00	-03:00	
ES	+2806-01524	Atlantic/Canary	Canary Islands	+00:00	+01:00	
CV	+1455-02331	Atlantic/Cape_Verde		-01:00	-01:00	
Atlantic/Faeroe		+00:00	+01:00	Link to Atlantic/Faroe
FO	+6201-00646	Atlantic/Faroe		+00:00	+01:00	
Atlantic/Jan_Mayen		+01:00	+02:00	Link to Europe/Oslo
PT	+3238-01654	Atlantic/Madeira	Madeira Islands	+00:00	+01:00	
IS	+6409-02151	Atlantic/Reykjavik		+00:00	+00:00	
GS	-5416-03632	Atlantic/South_Georgia		-02:00	-02:00	
SH	-1555-00542	Atlantic/St_Helena		+00:00	+00:00	Link to Africa/Abidjan
FK	-5142-05751	Atlantic/Stanley		-03:00	-03:00	
Australia/ACT		+10:00	+11:00	Link to Australia/Sydney
AU	-3455+13835	Australia/Adelaide	South Australia	+09:30	+10:30	
AU	-2728+15302	Australia/Brisbane	Queensland (most areas)	+10:00	+10:00	
AU	-3157+14127	Australia/Broken_Hill	New South Wales (Yancowinna)	+09:30	+10:30	
Australia/Canberra		+10:00	+11:00	Link to Australia/Sydney
AU	-3956+14352	Australia/Currie	Tasmania (King Island)	+10:00	+11:00	
AU	-1228+13050	Australia/Darwin	Northern Territory	+09:30	+09:30	
AU	-3143+12852	Australia/Eucla	Western Australia (Eucla)	+08:45	+08:45	
AU	-4253+14719	Australia/Hobart	Tasmania (most areas)	+10:00	+11:00	
Australia/LHI		+10:30	+11:00	Link to Australia/Lord_Howe
AU	-2016+14900	Australia/Lindeman	Queensland (Whitsunday Islands)	+10:00	+10:00	
AU	-3133+15905	Australia/Lord_Howe	Lord Howe Island	+10:30	+11:00	
AU	-3749+14458	Australia/Melbourne	Victoria	+10:00	+11:00	
Australia/North		+09:30	+09:30	Link to Australia/Darwin
Australia/NSW		+10:00	+11:00	Link to Australia/Sydney
AU	-3157+11551	Australia/Perth	Western Australia (most areas)	+08:00	+08:00	
Australia/Queensland		+10:00	+10:00	Link to Australia/Brisbane
Australia/South		+09:30	+10:30	Link to Australia/Adelaide
AU	-3352+15113	Australia/Sydney	New South Wales (most areas)	+10:00	+11:00	
Australia/Tasmania		+10:00	+11:00	Link to Australia/Hobart
Australia/Victoria		+10:00	+11:00	Link to Australia/Melbourne
Australia/West		+08:00	+08:00	Link to Australia/Perth
Australia/Yancowinna		+09:30	+10:30	Link to Australia/Broken_Hill
Brazil/Acre		-05:00	-05:00	Link to America/Rio_Branco
Brazil/DeNoronha		-02:00	-02:00	Link to America/Noronha
Brazil/East		-03:00	-02:00	Link to America/Sao_Paulo
Brazil/West		-04:00	-04:00	Link to America/Manaus
Canada/Atlantic		-04:00	-03:00	Link to America/Halifax
Canada/Central		-06:00	-05:00	Link to America/Winnipeg
Canada/Eastern		-05:00	-04:00	Link to America/Toronto
Canada/East-Saskatchewan		-06:00	-06:00	Link to America/Regina
Canada/Mountain		-07:00	-06:00	Link to America/Edmonton
Canada/Newfoundland		-03:30	-02:30	Link to America/St_Johns
Canada/Pacific		-08:00	-07:00	Link to America/Vancouver
Canada/Saskatchewan		-06:00	-06:00	Link to America/Regina
Canada/Yukon		-08:00	-07:00	Link to America/Whitehorse
CET		+01:00	+02:00	
Chile/Continental		-04:00	-03:00	Link to America/Santiago
Chile/EasterIsland		-06:00	-05:00	Link to Pacific/Easter
CST6CDT		-06:00	-05:00	
Cuba		-05:00	-04:00	Link to America/Havana
EET		+02:00	+03:00	
Egypt		+02:00	+02:00	Link to Africa/Cairo
Eire		+00:00	+01:00	Link to Europe/Dublin
EST		-05:00	-05:00	
EST5EDT		-05:00	-04:00	
Etc/GMT		+00:00	+00:00	
Etc/GMT+0		+00:00	+00:00	Link to Etc/GMT
Etc/GMT+1		-01:00	-01:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT+10		-10:00	-10:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT+11		-11:00	-11:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT+12		-12:00	-12:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT+2		-02:00	-02:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT+3		-03:00	-03:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT+4		-04:00	-04:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT+5		-05:00	-05:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT+6		-06:00	-06:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT+7		-07:00	-07:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT+8		-08:00	-08:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT+9		-09:00	-09:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT0		+00:00	+00:00	Link to Etc/GMT
Etc/GMT-0		+00:00	+00:00	Link to Etc/GMT
Etc/GMT-1		+01:00	+01:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT-10		+10:00	+10:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT-11		+11:00	+11:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT-12		+12:00	+12:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT-13		+13:00	+13:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT-14		+14:00	+14:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT-2		+02:00	+02:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT-3		+03:00	+03:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT-4		+04:00	+04:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT-5		+05:00	+05:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT-6		+06:00	+06:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT-7		+07:00	+07:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT-8		+08:00	+08:00	Sign is intentionally inverted. See the Etc area description.
Etc/GMT-9		+09:00	+09:00	Sign is intentionally inverted. See the Etc area description.
Etc/Greenwich		+00:00	+00:00	Link to Etc/GMT
Etc/UCT		+00:00	+00:00	
Etc/Universal		+00:00	+00:00	Link to Etc/UTC
Etc/UTC		+00:00	+00:00	
Etc/Zulu		+00:00	+00:00	Link to Etc/UTC
NL	+5222+00454	Europe/Amsterdam		+01:00	+02:00	
AD	+4230+00131	Europe/Andorra		+01:00	+02:00	
RU	+4621+04803	Europe/Astrakhan	MSK+01 - Astrakhan	+04:00	+04:00	
GR	+3758+02343	Europe/Athens		+02:00	+03:00	
Europe/Belfast		+00:00	+01:00	Link to Europe/London
RS	+4450+02030	Europe/Belgrade		+01:00	+02:00	
DE	+5230+01322	Europe/Berlin	Germany (most areas)	+01:00	+02:00	In 1945, the Trizone did not follow Berlin's switch to DST, see Time in Germany
SK	+4809+01707	Europe/Bratislava		+01:00	+02:00	Link to Europe/Prague
BE	+5050+00420	Europe/Brussels		+01:00	+02:00	
RO	+4426+02606	Europe/Bucharest		+02:00	+03:00	
HU	+4730+01905	Europe/Budapest		+01:00	+02:00	
DE	+4742+00841	Europe/Busingen	Busingen	+01:00	+02:00	Link to Europe/Zurich
MD	+4700+02850	Europe/Chisinau		+02:00	+03:00	
DK	+5540+01235	Europe/Copenhagen		+01:00	+02:00	
IE	+5320-00615	Europe/Dublin		+00:00	+01:00	
GI	+3608-00521	Europe/Gibraltar		+01:00	+02:00	
GG	+4927-00232	Europe/Guernsey		+00:00	+01:00	Link to Europe/London
FI	+6010+02458	Europe/Helsinki		+02:00	+03:00	
IM	+5409-00428	Europe/Isle_of_Man		+00:00	+01:00	Link to Europe/London
TR	+4101+02858	Europe/Istanbul		+03:00	+03:00	
JE	+4912-00207	Europe/Jersey		+00:00	+01:00	Link to Europe/London
RU	+5443+02030	Europe/Kaliningrad	MSK-01 - Kaliningrad	+02:00	+02:00	
UA	+5026+03031	Europe/Kiev	Ukraine (most areas)	+02:00	+03:00	
RU	+5836+04939	Europe/Kirov	MSK+00 - Kirov	+03:00	+03:00	
PT	+3843-00908	Europe/Lisbon	Portugal (mainland)	+00:00	+01:00	
SI	+4603+01431	Europe/Ljubljana		+01:00	+02:00	Link to Europe/Belgrade
GB	+513030-0000731	Europe/London		+00:00	+01:00	
LU	+4936+00609	Europe/Luxembourg		+01:00	+02:00	
ES	+4024-00341	Europe/Madrid	Spain (mainland)	+01:00	+02:00	
MT	+3554+01431	Europe/Malta		+01:00	+02:00	
AX	+6006+01957	Europe/Mariehamn		+02:00	+03:00	Link to Europe/Helsinki
BY	+5354+02734	Europe/Minsk		+03:00	+03:00	
MC	+4342+00723	Europe/Monaco		+01:00	+02:00	
RU	+554521+0373704	Europe/Moscow	MSK+00 - Moscow area	+03:00	+03:00	
Europe/Nicosia		+02:00	+03:00	Link to Asia/Nicosia
NO	+5955+01045	Europe/Oslo		+01:00	+02:00	
FR	+4852+00220	Europe/Paris		+01:00	+02:00	
ME	+4226+01916	Europe/Podgorica		+01:00	+02:00	Link to Europe/Belgrade
CZ	+5005+01426	Europe/Prague		+01:00	+02:00	
LV	+5657+02406	Europe/Riga		+02:00	+03:00	
IT	+4154+01229	Europe/Rome		+01:00	+02:00	
RU	+5312+05009	Europe/Samara	MSK+01 - Samara, Udmurtia	+04:00	+04:00	
SM	+4355+01228	Europe/San_Marino		+01:00	+02:00	Link to Europe/Rome
BA	+4352+01825	Europe/Sarajevo		+01:00	+02:00	Link to Europe/Belgrade
RU	+5134+04602	Europe/Saratov	MSK+01 - Saratov	+04:00	+04:00	
RU	+4457+03406	Europe/Simferopol	MSK+00 - Crimea	+03:00	+03:00	Disputed - Reflects data in the TZDB.[note 3]
MK	+4159+02126	Europe/Skopje		+01:00	+02:00	Link to Europe/Belgrade
BG	+4241+02319	Europe/Sofia		+02:00	+03:00	
SE	+5920+01803	Europe/Stockholm		+01:00	+02:00	
EE	+5925+02445	Europe/Tallinn		+02:00	+03:00	
AL	+4120+01950	Europe/Tirane		+01:00	+02:00	
Europe/Tiraspol		+02:00	+03:00	Link to Europe/Chisinau
RU	+5420+04824	Europe/Ulyanovsk	MSK+01 - Ulyanovsk	+04:00	+04:00	
UA	+4837+02218	Europe/Uzhgorod	Ruthenia	+02:00	+03:00	
LI	+4709+00931	Europe/Vaduz		+01:00	+02:00	Link to Europe/Zurich
VA	+415408+0122711	Europe/Vatican		+01:00	+02:00	Link to Europe/Rome
AT	+4813+01620	Europe/Vienna		+01:00	+02:00	
LT	+5441+02519	Europe/Vilnius		+02:00	+03:00	
RU	+4844+04425	Europe/Volgograd	MSK+00 - Volgograd	+03:00	+03:00	
PL	+5215+02100	Europe/Warsaw		+01:00	+02:00	
HR	+4548+01558	Europe/Zagreb		+01:00	+02:00	Link to Europe/Belgrade
UA	+4750+03510	Europe/Zaporozhye	Zaporozh'ye/Zaporizhia; Lugansk/Luhansk (east)	+02:00	+03:00	
CH	+4723+00832	Europe/Zurich		+01:00	+02:00	
GB		+00:00	+01:00	Link to Europe/London
GB-Eire		+00:00	+01:00	Link to Europe/London
GMT		+00:00	+00:00	Link to Etc/GMT
GMT+0		+00:00	+00:00	Link to Etc/GMT
GMT0		+00:00	+00:00	Link to Etc/GMT
GMT-0		+00:00	+00:00	Link to Etc/GMT
Greenwich		+00:00	+00:00	Link to Etc/GMT
Hongkong		+08:00	+08:00	Link to Asia/Hong_Kong
HST		-10:00	-10:00	
Iceland		+00:00	+00:00	Link to Atlantic/Reykjavik
MG	-1855+04731	Indian/Antananarivo		+03:00	+03:00	Link to Africa/Nairobi
IO	-0720+07225	Indian/Chagos		+06:00	+06:00	
CX	-1025+10543	Indian/Christmas		+07:00	+07:00	
CC	-1210+09655	Indian/Cocos		+06:30	+06:30	
KM	-1141+04316	Indian/Comoro		+03:00	+03:00	Link to Africa/Nairobi
TF	-492110+0701303	Indian/Kerguelen		+05:00	+05:00	
SC	-0440+05528	Indian/Mahe		+04:00	+04:00	
MV	+0410+07330	Indian/Maldives		+05:00	+05:00	
MU	-2010+05730	Indian/Mauritius		+04:00	+04:00	
YT	-1247+04514	Indian/Mayotte		+03:00	+03:00	Link to Africa/Nairobi
RE	-2052+05528	Indian/Reunion		+04:00	+04:00	
Iran		+03:30	+04:30	Link to Asia/Tehran
Israel		+02:00	+03:00	Link to Asia/Jerusalem
Jamaica		-05:00	-05:00	Link to America/Jamaica
Japan		+09:00	+09:00	Link to Asia/Tokyo
Kwajalein		+12:00	+12:00	Link to Pacific/Kwajalein
Libya		+02:00	+02:00	Link to Africa/Tripoli
MET		+01:00	+02:00	
Mexico/BajaNorte		-08:00	-07:00	Link to America/Tijuana
Mexico/BajaSur		-07:00	-06:00	Link to America/Mazatlan
Mexico/General		-06:00	-05:00	Link to America/Mexico_City
MST		-07:00	-07:00	
MST7MDT		-07:00	-06:00	
Navajo		-07:00	-06:00	Link to America/Denver
NZ		+12:00	+13:00	Link to Pacific/Auckland
NZ-CHAT		+12:45	+13:45	Link to Pacific/Chatham
WS	-1350-17144	Pacific/Apia		+13:00	+14:00	
NZ	-3652+17446	Pacific/Auckland	New Zealand (most areas)	+12:00	+13:00	
PG	-0613+15534	Pacific/Bougainville	Bougainville	+11:00	+11:00	
NZ	-4357-17633	Pacific/Chatham	Chatham Islands	+12:45	+13:45	
FM	+0725+15147	Pacific/Chuuk	Chuuk/Truk, Yap	+10:00	+10:00	
CL	-2709-10926	Pacific/Easter	Easter Island	-06:00	-05:00	
VU	-1740+16825	Pacific/Efate		+11:00	+11:00	
KI	-0308-17105	Pacific/Enderbury	Phoenix Islands	+13:00	+13:00	
TK	-0922-17114	Pacific/Fakaofo		+13:00	+13:00	
FJ	-1808+17825	Pacific/Fiji		+12:00	+13:00	
TV	-0831+17913	Pacific/Funafuti		+12:00	+12:00	
EC	-0054-08936	Pacific/Galapagos	Galapagos Islands	-06:00	-06:00	
PF	-2308-13457	Pacific/Gambier	Gambier Islands	-09:00	-09:00	
SB	-0932+16012	Pacific/Guadalcanal		+11:00	+11:00	
GU	+1328+14445	Pacific/Guam		+10:00	+10:00	
US	+211825-1575130	Pacific/Honolulu	Hawaii	-10:00	-10:00	
Pacific/Johnston		-10:00	-10:00	Link to Pacific/Honolulu
KI	+0152-15720	Pacific/Kiritimati	Line Islands	+14:00	+14:00	
FM	+0519+16259	Pacific/Kosrae	Kosrae	+11:00	+11:00	
MH	+0905+16720	Pacific/Kwajalein	Kwajalein	+12:00	+12:00	
MH	+0709+17112	Pacific/Majuro	Marshall Islands (most areas)	+12:00	+12:00	
PF	-0900-13930	Pacific/Marquesas	Marquesas Islands	-09:30	-09:30	
UM	+2813-17722	Pacific/Midway	Midway Islands	-11:00	-11:00	Link to Pacific/Pago_Pago
NR	-0031+16655	Pacific/Nauru		+12:00	+12:00	
NU	-1901-16955	Pacific/Niue		-11:00	-11:00	
NF	-2903+16758	Pacific/Norfolk		+11:00	+11:00	
NC	-2216+16627	Pacific/Noumea		+11:00	+11:00	
AS	-1416-17042	Pacific/Pago_Pago		-11:00	-11:00	
PW	+0720+13429	Pacific/Palau		+09:00	+09:00	
PN	-2504-13005	Pacific/Pitcairn		-08:00	-08:00	
FM	+0658+15813	Pacific/Pohnpei	Pohnpei/Ponape	+11:00	+11:00	
Pacific/Ponape		+11:00	+11:00	Link to Pacific/Pohnpei
PG	-0930+14710	Pacific/Port_Moresby	Papua New Guinea (most areas)	+10:00	+10:00	
CK	-2114-15946	Pacific/Rarotonga		-10:00	-10:00	
MP	+1512+14545	Pacific/Saipan		+10:00	+10:00	Link to Pacific/Guam
Pacific/Samoa		-11:00	-11:00	Link to Pacific/Pago_Pago
PF	-1732-14934	Pacific/Tahiti	Society Islands	-10:00	-10:00	
KI	+0125+17300	Pacific/Tarawa	Gilbert Islands	+12:00	+12:00	
TO	-2110-17510	Pacific/Tongatapu		+13:00	+14:00	
Pacific/Truk		+10:00	+10:00	Link to Pacific/Chuuk
UM	+1917+16637	Pacific/Wake	Wake Island	+12:00	+12:00	
WF	-1318-17610	Pacific/Wallis		+12:00	+12:00	
Pacific/Yap		+10:00	+10:00	Link to Pacific/Chuuk
Poland		+01:00	+02:00	Link to Europe/Warsaw
Portugal		+00:00	+01:00	Link to Europe/Lisbon
PRC		+08:00	+08:00	Link to Asia/Shanghai
PST8PDT		-08:00	-07:00	
ROC		+08:00	+08:00	Link to Asia/Taipei
ROK		+09:00	+09:00	Link to Asia/Seoul
Singapore		+08:00	+08:00	Link to Asia/Singapore
Turkey		+03:00	+03:00	Link to Europe/Istanbul
UCT		+00:00	+00:00	Link to Etc/UCT
Universal		+00:00	+00:00	Link to Etc/UTC
US/Alaska		-09:00	-08:00	Link to America/Anchorage
US/Aleutian		-10:00	-09:00	Link to America/Adak
US/Arizona		-07:00	-07:00	Link to America/Phoenix
US/Central		-06:00	-05:00	Link to America/Chicago
US/Eastern		-05:00	-04:00	Link to America/New_York
US/East-Indiana		-05:00	-04:00	Link to America/Indiana/Indianapolis
US/Hawaii		-10:00	-10:00	Link to Pacific/Honolulu
US/Indiana-Starke		-06:00	-05:00	Link to America/Indiana/Knox
US/Michigan		-05:00	-04:00	Link to America/Detroit
US/Mountain		-07:00	-06:00	Link to America/Denver
US/Pacific		-08:00	-07:00	Link to America/Los_Angeles
US/Pacific-New		-08:00	-07:00	Link to America/Los_Angeles
US/Samoa		-11:00	-11:00	Link to Pacific/Pago_Pago
UTC		+00:00	+00:00	Link to Etc/UTC
WET		+00:00	+01:00	
W-SU		+03:00	+03:00	Link to Europe/Moscow
Zulu		+00:00	+00:00	Link to Etc/UTC
