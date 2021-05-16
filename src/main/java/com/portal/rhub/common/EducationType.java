package com.portal.rhub.common;

public enum EducationType {

	B_Tech_BE(1,"B.Tech/B.E"," B.Tech/B.E"),
	B_Com(2,"B.Com",""),
	MCA(3,"MCA",""),
	MBA(4,"MBA",""),
	M_Tech(5,"M_Tech","");


	public final String label;
	public final Integer id;
	public final String description;

	EducationType(Integer id,String label,String description) {
		this.id = id;
		this.label = label;
		this.description = description;
	}
}





/*  No Need to add All 
 * 
B.Tech/B.E.
BCA
MCA
B.Com.
B.Com.(Hons.)
M.Com.(Hons.)
BBA
MBA
B.Sc.
B.Sc.(Hons.)
B.Sc.(Hotel Management)
M.Sc.
M.Sc.(Hons.)
Diploma 1 Yr.
Diploma 2 Yr.
Diploma 3 Yr.
P.G. Diploma 1 Yr.
P.G. Diploma 2 Yr.
B. Pharm
B.A.
B.A.(Hons.)
B.Arch
B.Des
B.E-Com.
B.Ed
B.F.Tech
BAF
BBI
BBM
BBS
BCM
BDS
BFIA
BFM
BHM 3 Yr.
BHM 4 Yr.
BIM
BIT
BJMC
BMM
BMS
Chartered Accountant
LL.B
M. Pharm
M.A.
M.A.(Hons.)
M.Arch
M.Des
M.F.Tech
M.Phil.
M.Sc. (Tech.)
M.Tech./M.E.
MBBS
MBE
MCM
MFM
MMS
MSW
Nursing
P.G.D.B.A
P.G.D.B.M.
P.G.D.C.A
Ph.D. */

