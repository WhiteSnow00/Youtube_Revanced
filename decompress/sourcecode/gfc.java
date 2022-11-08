import java.util.Map;
import j$.util.Map$_EL;
import app.revanced.integrations.patches.PremiumHeaderPatch;
import java.util.EnumMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gfc implements acng
{
    private final EnumMap a;
    private final EnumMap b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    
    public gfc(final uyf uyf) {
        final ahoq n = qcv.n(uyf);
        boolean c = false;
        if (n != null) {
            c = c;
            if (n.m) {
                c = true;
            }
        }
        this.c = c;
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        this.d = alvl.bf;
        alvl alvl2;
        if ((alvl2 = uyf.b().e) == null) {
            alvl2 = alvl.a;
        }
        this.e = alvl2.bq;
        this.a = this.c();
        final EnumMap<Enum, Integer> b = new EnumMap<Enum, Integer>((Class<Enum>)akbe.class);
        b.put((Enum)akbe.aB, 2131233594);
        b.put((Enum)akbe.aA, 2131233597);
        b.put((Enum)akbe.jx, 2131233534);
        b.put((Enum)akbe.jB, 2131233591);
        final akbe jd = akbe.jD;
        final Integer value = 2131233535;
        b.put((Enum)jd, value);
        b.put((Enum)akbe.bj, 2131233503);
        b.put((Enum)akbe.bb, 2131233517);
        b.put((Enum)akbe.bk, 2131233538);
        b.put((Enum)akbe.bq, 2131233605);
        b.put((Enum)akbe.bf, value);
        b.put((Enum)akbe.lf, value);
        this.b = b;
    }
    
    private final EnumMap c() {
        final EnumMap enumMap = new EnumMap((Class<K>)akbe.class);
        enumMap.put((Enum)akbe.de, 2131233847);
        enumMap.put((Enum)akbe.dd, 2131232578);
        enumMap.put((Enum)akbe.kV, 2131233486);
        enumMap.put((Enum)akbe.kW, 2131233616);
        enumMap.put((Enum)akbe.hv, 2131233617);
        enumMap.put((Enum)akbe.lx, 2131231407);
        enumMap.put((Enum)akbe.hw, 2131233620);
        enumMap.put((Enum)akbe.ic, 2131232579);
        enumMap.put((Enum)akbe.oE, 2131232581);
        enumMap.put((Enum)akbe.dp, 2131232868);
        enumMap.put((Enum)akbe.au, 2131231859);
        final akbe ao = akbe.aO;
        final Integer value = 2131233704;
        enumMap.put((Enum)ao, value);
        enumMap.put((Enum)akbe.hm, 2131233781);
        final akbe hn = akbe.hn;
        final Integer value2 = 2131233780;
        enumMap.put((Enum)hn, value2);
        enumMap.put((Enum)akbe.nu, value2);
        final akbe ah = akbe.aH;
        final Integer value3 = 2131233886;
        enumMap.put((Enum)ah, value3);
        enumMap.put((Enum)akbe.hu, 2131232877);
        enumMap.put((Enum)akbe.nK, 2131232091);
        final akbe jq = akbe.jq;
        int n;
        if (!this.c) {
            n = 2131231418;
        }
        else {
            n = 2131233519;
        }
        enumMap.put((Enum)jq, n);
        enumMap.put((Enum)akbe.jR, 2131232590);
        enumMap.put((Enum)akbe.nw, 2131232592);
        enumMap.put((Enum)akbe.mf, 2131232595);
        enumMap.put((Enum)akbe.me, 2131232598);
        enumMap.put((Enum)akbe.jQ, 2131232600);
        enumMap.put((Enum)akbe.gO, 2131233631);
        enumMap.put((Enum)akbe.gD, 2131232604);
        enumMap.put((Enum)akbe.nx, 2131232602);
        enumMap.put((Enum)akbe.fk, 2131233660);
        enumMap.put((Enum)akbe.pX, 2131233648);
        enumMap.put((Enum)akbe.pY, 2131233647);
        enumMap.put((Enum)akbe.pZ, 2131233649);
        enumMap.put((Enum)akbe.qa, 2131233650);
        enumMap.put((Enum)akbe.mD, 2131232284);
        enumMap.put((Enum)akbe.os, 2131231440);
        enumMap.put((Enum)akbe.or, 2131231441);
        enumMap.put((Enum)akbe.hT, 2131232591);
        enumMap.put((Enum)akbe.ff, 2131232105);
        enumMap.put((Enum)akbe.fg, 2131232103);
        enumMap.put((Enum)akbe.fh, 2131232104);
        final akbe jt = akbe.jt;
        final Integer value4 = 2131231448;
        enumMap.put((Enum)jt, value4);
        enumMap.put((Enum)akbe.du, value4);
        enumMap.put((Enum)akbe.lS, 2131231449);
        enumMap.put((Enum)akbe.lT, 2131232618);
        enumMap.put((Enum)akbe.gK, 2131232586);
        enumMap.put((Enum)akbe.gL, 2131233678);
        enumMap.put((Enum)akbe.gM, 2131233633);
        final akbe gn = akbe.gN;
        final Integer value5 = 2131233644;
        enumMap.put((Enum)gn, value5);
        enumMap.put((Enum)akbe.dt, 2131232654);
        enumMap.put((Enum)akbe.az, 2131232662);
        enumMap.put((Enum)akbe.dX, 2131232842);
        enumMap.put((Enum)akbe.dY, 2131232838);
        enumMap.put((Enum)akbe.gT, 2131233800);
        enumMap.put((Enum)akbe.gU, 2131233540);
        enumMap.put((Enum)akbe.gp, 2131232647);
        final akbe mw = akbe.mW;
        final boolean e = this.e;
        final int n2 = 2131233506;
        int n3;
        if (!e) {
            n3 = 2131232633;
        }
        else {
            n3 = 2131233506;
        }
        enumMap.put((Enum)mw, n3);
        final akbe mx = akbe.mX;
        final boolean e2 = this.e;
        final int n4 = 2131233668;
        int n5;
        if (!e2) {
            n5 = 2131232635;
        }
        else {
            n5 = 2131233668;
        }
        enumMap.put((Enum)mx, n5);
        final akbe nl = akbe.nl;
        int n6 = n2;
        if (!this.e) {
            n6 = 2131232076;
        }
        enumMap.put((Enum)nl, n6);
        final akbe nm = akbe.nm;
        int n7 = n4;
        if (!this.e) {
            n7 = 2131232075;
        }
        enumMap.put((Enum)nm, n7);
        enumMap.put((Enum)akbe.hk, 2131232641);
        enumMap.put((Enum)akbe.gv, 2131233690);
        enumMap.put((Enum)akbe.gw, 2131232651);
        enumMap.put((Enum)akbe.nV, 2131232652);
        enumMap.put((Enum)akbe.gn, 2131233929);
        enumMap.put((Enum)akbe.go, 2131232658);
        enumMap.put((Enum)akbe.L, 2131231499);
        enumMap.put((Enum)akbe.oG, 2131232529);
        enumMap.put((Enum)akbe.gQ, 2131232674);
        enumMap.put((Enum)akbe.mr, 2131233870);
        enumMap.put((Enum)akbe.ms, 2131233871);
        enumMap.put((Enum)akbe.hl, 2131233710);
        enumMap.put((Enum)akbe.mA, 2131232795);
        enumMap.put((Enum)akbe.am, 2131232521);
        enumMap.put((Enum)akbe.aa, 2131233954);
        final akbe ix = akbe.iX;
        final Integer value6 = 2131233918;
        enumMap.put((Enum)ix, value6);
        enumMap.put((Enum)akbe.iY, 2131231460);
        enumMap.put((Enum)akbe.nJ, 2131231489);
        enumMap.put((Enum)akbe.oC, 2131231406);
        enumMap.put((Enum)akbe.oD, 2131233618);
        enumMap.put((Enum)akbe.jS, 2131232619);
        enumMap.put((Enum)akbe.jT, 2131232620);
        enumMap.put((Enum)akbe.aI, 2131232683);
        enumMap.put((Enum)akbe.aJ, 2131232684);
        enumMap.put((Enum)akbe.aB, 2131233902);
        enumMap.put((Enum)akbe.aD, 2131233594);
        enumMap.put((Enum)akbe.bK, 2131232659);
        enumMap.put((Enum)akbe.sf, 2131233715);
        enumMap.put((Enum)akbe.op, 2131232532);
        enumMap.put((Enum)akbe.gF, 2131233632);
        enumMap.put((Enum)akbe.nZ, 2131232690);
        enumMap.put((Enum)akbe.ab, 2131232693);
        enumMap.put((Enum)akbe.ev, 2131232695);
        enumMap.put((Enum)akbe.kx, 2131231912);
        enumMap.put((Enum)akbe.gG, 2131232045);
        enumMap.put((Enum)akbe.gI, 2131231395);
        enumMap.put((Enum)akbe.gH, 2131231855);
        enumMap.put((Enum)akbe.gJ, 2131231628);
        enumMap.put((Enum)akbe.jO, 2131233050);
        final akbe in = akbe.iN;
        final Integer value7 = 2131232704;
        enumMap.put((Enum)in, value7);
        enumMap.put((Enum)akbe.iO, value7);
        enumMap.put((Enum)akbe.jf, 2131232707);
        enumMap.put((Enum)akbe.K, 2131231503);
        enumMap.put((Enum)akbe.nF, 2131233688);
        enumMap.put((Enum)akbe.rn, 2131233754);
        final akbe az = akbe.aZ;
        final Integer value8 = 2131233709;
        enumMap.put((Enum)az, value8);
        final akbe fc = akbe.fC;
        int n8;
        if (!this.c) {
            n8 = 2131232856;
        }
        else {
            n8 = 2131233565;
        }
        enumMap.put((Enum)fc, n8);
        enumMap.put((Enum)akbe.fe, value6);
        enumMap.put((Enum)akbe.fd, 2131231537);
        enumMap.put((Enum)akbe.oX, 2131233726);
        enumMap.put((Enum)akbe.nG, 2131232712);
        enumMap.put((Enum)akbe.cD, 2131233796);
        enumMap.put((Enum)akbe.fS, 2131232729);
        enumMap.put((Enum)akbe.aE, 2131233735);
        enumMap.put((Enum)akbe.cM, 2131232725);
        enumMap.put((Enum)akbe.ng, 2131233739);
        enumMap.put((Enum)akbe.qO, 2131233532);
        enumMap.put((Enum)akbe.qq, 2131233743);
        enumMap.put((Enum)akbe.qg, 2131233744);
        enumMap.put((Enum)akbe.oq, 2131232505);
        enumMap.put((Enum)akbe.bO, 2131232947);
        enumMap.put((Enum)akbe.bD, 2131233866);
        enumMap.put((Enum)akbe.ax, 2131233869);
        enumMap.put((Enum)akbe.lz, 2131232761);
        enumMap.put((Enum)akbe.aG, value3);
        enumMap.put((Enum)akbe.jV, 2131233725);
        enumMap.put((Enum)akbe.iI, 2131231608);
        enumMap.put((Enum)akbe.hO, 2131232764);
        enumMap.put((Enum)akbe.ls, 2131233758);
        final akbe ax = akbe.ax;
        final Integer value9 = 2131233759;
        enumMap.put((Enum)ax, value9);
        enumMap.put((Enum)akbe.ay, value9);
        enumMap.put((Enum)akbe.et, 2131232137);
        enumMap.put((Enum)akbe.eu, 2131232138);
        enumMap.put((Enum)akbe.hI, 2131232773);
        enumMap.put((Enum)akbe.hJ, 2131231619);
        enumMap.put((Enum)akbe.mU, 2131232779);
        enumMap.put((Enum)akbe.mV, 2131232782);
        enumMap.put((Enum)akbe.np, 2131232784);
        enumMap.put((Enum)akbe.nq, 2131232776);
        enumMap.put((Enum)akbe.jp, 2131233762);
        enumMap.put((Enum)akbe.oc, 2131232790);
        enumMap.put((Enum)akbe.fD, 2131232792);
        enumMap.put((Enum)akbe.kN, 2131233766);
        enumMap.put((Enum)akbe.kO, 2131233536);
        final akbe aa = akbe.aA;
        final Integer value10 = 2131233904;
        enumMap.put((Enum)aa, value10);
        enumMap.put((Enum)akbe.aC, 2131233597);
        enumMap.put((Enum)akbe.H, value10);
        enumMap.put((Enum)akbe.hZ, 2131232798);
        enumMap.put((Enum)akbe.dy, 2131233055);
        enumMap.put((Enum)akbe.qi, 2131233057);
        enumMap.put((Enum)akbe.nc, 2131232805);
        enumMap.put((Enum)akbe.na, 2131232807);
        enumMap.put((Enum)akbe.lJ, 2131233783);
        final akbe mn = akbe.mn;
        final Integer value11 = 2131232809;
        enumMap.put((Enum)mn, value11);
        enumMap.put((Enum)akbe.bP, 2131232946);
        enumMap.put((Enum)akbe.fc, 2131231657);
        enumMap.put((Enum)akbe.qs, 2131233792);
        enumMap.put((Enum)akbe.er, 2131231968);
        final akbe es = akbe.es;
        final Integer value12 = 2131232628;
        enumMap.put((Enum)es, value12);
        final akbe fu = akbe.fu;
        final Integer value13 = 2131232985;
        enumMap.put((Enum)fu, value13);
        enumMap.put((Enum)akbe.ft, value13);
        enumMap.put((Enum)akbe.fs, value13);
        enumMap.put((Enum)akbe.fq, value13);
        enumMap.put((Enum)akbe.fv, value13);
        enumMap.put((Enum)akbe.I, 2131231507);
        enumMap.put((Enum)akbe.eZ, 2131231669);
        enumMap.put((Enum)akbe.cv, 2131233714);
        enumMap.put((Enum)akbe.eM, 2131231670);
        enumMap.put((Enum)akbe.eH, 2131233751);
        enumMap.put((Enum)akbe.eJ, 2131233897);
        enumMap.put((Enum)akbe.eI, 2131233790);
        enumMap.put((Enum)akbe.eK, 2131233911);
        enumMap.put((Enum)akbe.eL, 2131233798);
        enumMap.put((Enum)akbe.eN, 2131233939);
        enumMap.put((Enum)akbe.eO, 2131231674);
        enumMap.put((Enum)akbe.eP, 2131231673);
        enumMap.put((Enum)akbe.eQ, 2131231672);
        enumMap.put((Enum)akbe.eR, 2131233716);
        enumMap.put((Enum)akbe.eS, 2131233518);
        enumMap.put((Enum)akbe.jW, 2131232610);
        final akbe hs = akbe.hs;
        final Integer value14 = 2131232821;
        enumMap.put((Enum)hs, value14);
        enumMap.put((Enum)akbe.ht, value14);
        enumMap.put((Enum)akbe.hr, 2131232827);
        enumMap.put((Enum)akbe.iC, 2131233733);
        enumMap.put((Enum)akbe.iD, 2131232999);
        enumMap.put((Enum)akbe.M, 2131232834);
        enumMap.put((Enum)akbe.nB, 2131233829);
        final akbe kk = akbe.kK;
        final Integer value15 = 2131233423;
        enumMap.put((Enum)kk, value15);
        enumMap.put((Enum)akbe.qR, 2131233890);
        enumMap.put((Enum)akbe.jZ, value3);
        enumMap.put((Enum)akbe.eb, 2131232841);
        enumMap.put((Enum)akbe.ej, 2131233504);
        enumMap.put((Enum)akbe.ee, 2131232687);
        enumMap.put((Enum)akbe.V, 2131231508);
        final akbe ei = akbe.ei;
        final Integer value16 = 2131233665;
        enumMap.put((Enum)ei, value16);
        enumMap.put((Enum)akbe.ek, 2131231823);
        enumMap.put((Enum)akbe.ec, 2131233666);
        enumMap.put((Enum)akbe.lB, 2131233651);
        enumMap.put((Enum)akbe.j, 2131231509);
        enumMap.put((Enum)akbe.k, 2131231829);
        enumMap.put((Enum)akbe.y, 2131233520);
        enumMap.put((Enum)akbe.z, 2131231830);
        final akbe l = akbe.l;
        final Integer value17 = 2131233718;
        enumMap.put((Enum)l, value17);
        enumMap.put((Enum)akbe.w, 2131231836);
        enumMap.put((Enum)akbe.x, 2131231838);
        enumMap.put((Enum)akbe.v, 2131232857);
        final akbe t = akbe.t;
        final Integer value18 = 2131233907;
        enumMap.put((Enum)t, value18);
        enumMap.put((Enum)akbe.u, value17);
        final akbe df = akbe.df;
        int n9;
        if (!this.c) {
            n9 = 2131232853;
        }
        else {
            n9 = 2131233564;
        }
        enumMap.put((Enum)df, n9);
        enumMap.put((Enum)akbe.qG, 2131233628);
        enumMap.put((Enum)akbe.ps, 2131233655);
        enumMap.put((Enum)akbe.rB, 2131233836);
        enumMap.put((Enum)akbe.eY, 2131231490);
        enumMap.put((Enum)akbe.on, 2131232556);
        enumMap.put((Enum)akbe.oo, 2131233843);
        enumMap.put((Enum)akbe.ix, 2131232871);
        enumMap.put((Enum)akbe.iy, 2131233845);
        enumMap.put((Enum)akbe.nD, 2131232872);
        enumMap.put((Enum)akbe.iA, 2131233853);
        enumMap.put((Enum)akbe.fw, 2131232879);
        enumMap.put((Enum)akbe.gb, 2131232881);
        final akbe gd = akbe.gd;
        final Integer value19 = 2131233676;
        enumMap.put((Enum)gd, value19);
        enumMap.put((Enum)akbe.ge, 2131232883);
        enumMap.put((Enum)akbe.jx, 2131233752);
        enumMap.put((Enum)akbe.jy, 2131232762);
        final akbe jd = akbe.jD;
        final Integer value20 = 2131233768;
        enumMap.put((Enum)jd, value20);
        enumMap.put((Enum)akbe.jG, 2131231874);
        enumMap.put((Enum)akbe.jA, 2131231897);
        enumMap.put((Enum)akbe.jC, 2131231959);
        enumMap.put((Enum)akbe.jB, 2131233892);
        final akbe jz = akbe.jz;
        final Integer value21 = 2131232001;
        enumMap.put((Enum)jz, value21);
        enumMap.put((Enum)akbe.hd, 2131232893);
        enumMap.put((Enum)akbe.lj, 2131232889);
        enumMap.put((Enum)akbe.hf, 2131232038);
        enumMap.put((Enum)akbe.lr, 2131232899);
        enumMap.put((Enum)akbe.hg, 2131232898);
        enumMap.put((Enum)akbe.gi, 2131232901);
        enumMap.put((Enum)akbe.gh, 2131232903);
        enumMap.put((Enum)akbe.ir, 2131233778);
        enumMap.put((Enum)akbe.dZ, 2131231159);
        enumMap.put((Enum)akbe.ea, 2131231160);
        enumMap.put((Enum)akbe.pT, 2131232482);
        enumMap.put((Enum)akbe.i, 2131231510);
        enumMap.put((Enum)akbe.jr, 2131232606);
        enumMap.put((Enum)akbe.cE, value11);
        enumMap.put((Enum)akbe.nT, 2131233473);
        enumMap.put((Enum)akbe.bF, 2131233721);
        enumMap.put((Enum)akbe.bE, 2131233785);
        enumMap.put((Enum)akbe.bG, 2131233772);
        enumMap.put((Enum)akbe.li, 2131233022);
        enumMap.put((Enum)akbe.lh, 2131232763);
        enumMap.put((Enum)akbe.lg, 2131232804);
        enumMap.put((Enum)akbe.oy, 2131951707);
        enumMap.put((Enum)akbe.eU, 2131233894);
        enumMap.put((Enum)akbe.eV, 2131233895);
        enumMap.put((Enum)akbe.eW, 2131231976);
        enumMap.put((Enum)akbe.nd, 2131232757);
        enumMap.put((Enum)akbe.f, 2131233865);
        enumMap.put((Enum)akbe.hN, 2131233799);
        final akbe nk = akbe.nk;
        int n10;
        if (!this.d) {
            n10 = 2131232913;
        }
        else {
            n10 = 2131233512;
        }
        enumMap.put((Enum)nk, n10);
        final akbe jv = akbe.jv;
        int n11;
        if (!this.d) {
            n11 = 2131232914;
        }
        else {
            n11 = 2131233702;
        }
        enumMap.put((Enum)jv, n11);
        enumMap.put((Enum)akbe.ok, 2131231888);
        enumMap.put((Enum)akbe.lF, value15);
        enumMap.put((Enum)akbe.cU, 2131232919);
        enumMap.put((Enum)akbe.sm, 2131231891);
        enumMap.put((Enum)akbe.aL, value18);
        enumMap.put((Enum)akbe.iJ, 2131232920);
        enumMap.put((Enum)akbe.oF, 2131232922);
        enumMap.put((Enum)akbe.at, 2131231862);
        enumMap.put((Enum)akbe.ly, 2131231893);
        enumMap.put((Enum)akbe.cQ, 2131232565);
        enumMap.put((Enum)akbe.fB, 2131231873);
        enumMap.put((Enum)akbe.iG, 2131231906);
        enumMap.put((Enum)akbe.iE, 2131231907);
        enumMap.put((Enum)akbe.iF, 2131231908);
        enumMap.put((Enum)akbe.bQ, 2131232945);
        enumMap.put((Enum)akbe.kT, 2131232936);
        enumMap.put((Enum)akbe.el, 2131232943);
        enumMap.put((Enum)akbe.em, 2131233880);
        enumMap.put((Enum)akbe.aP, 2131233877);
        enumMap.put((Enum)akbe.aU, value5);
        enumMap.put((Enum)akbe.aQ, 2131231913);
        enumMap.put((Enum)akbe.aR, 2131233578);
        enumMap.put((Enum)akbe.aT, 2131232052);
        enumMap.put((Enum)akbe.aS, 2131233816);
        enumMap.put((Enum)akbe.ap, 2131233740);
        enumMap.put((Enum)akbe.aw, 2131231937);
        enumMap.put((Enum)akbe.cG, 2131233881);
        enumMap.put((Enum)akbe.pD, 2131232569);
        enumMap.put((Enum)akbe.do, 2131231901);
        final akbe ba = akbe.ba;
        final Integer value22 = 2131233949;
        enumMap.put((Enum)ba, value22);
        enumMap.put((Enum)akbe.om, 2131232957);
        enumMap.put((Enum)akbe.cX, 2131233642);
        enumMap.put((Enum)akbe.en, 2131231958);
        enumMap.put((Enum)akbe.eo, value12);
        enumMap.put((Enum)akbe.fx, 2131231991);
        enumMap.put((Enum)akbe.fR, 2131233795);
        enumMap.put((Enum)akbe.rN, 2131233888);
        enumMap.put((Enum)akbe.rO, 2131233586);
        enumMap.put((Enum)akbe.od, 2131232977);
        enumMap.put((Enum)akbe.oe, 2131232978);
        enumMap.put((Enum)akbe.of, 2131232979);
        enumMap.put((Enum)akbe.ha, value13);
        final akbe hb = akbe.hb;
        final Integer value23 = 2131233961;
        enumMap.put((Enum)hb, value23);
        enumMap.put((Enum)akbe.eT, value23);
        enumMap.put((Enum)akbe.gk, 2131232982);
        enumMap.put((Enum)akbe.gl, 2131232980);
        enumMap.put((Enum)akbe.gm, 2131232983);
        enumMap.put((Enum)akbe.jK, 2131232986);
        enumMap.put((Enum)akbe.jI, 2131232987);
        enumMap.put((Enum)akbe.oM, 2131232573);
        enumMap.put((Enum)akbe.qr, 2131233896);
        enumMap.put((Enum)akbe.qc, 2131233629);
        enumMap.put((Enum)akbe.nr, 2131231972);
        enumMap.put((Enum)akbe.ns, 2131231973);
        enumMap.put((Enum)akbe.eq, 2131232996);
        enumMap.put((Enum)akbe.cW, 2131233844);
        enumMap.put((Enum)akbe.mJ, 2131231981);
        enumMap.put((Enum)akbe.mK, 2131231982);
        enumMap.put((Enum)akbe.bh, 2131231983);
        enumMap.put((Enum)akbe.bj, value16);
        enumMap.put((Enum)akbe.bb, value8);
        enumMap.put((Enum)akbe.bc, 2131231984);
        enumMap.put((Enum)akbe.bk, 2131233789);
        enumMap.put((Enum)akbe.bf, value20);
        enumMap.put((Enum)akbe.bi, 2131231987);
        enumMap.put((Enum)akbe.bq, value22);
        enumMap.put((Enum)akbe.bd, 2131231988);
        enumMap.put((Enum)akbe.be, 2131231989);
        enumMap.put((Enum)akbe.jM, 2131232998);
        enumMap.put((Enum)akbe.ji, 2131233020);
        enumMap.put((Enum)akbe.iM, 2131232575);
        enumMap.put((Enum)akbe.U, 2131231864);
        enumMap.put((Enum)akbe.fY, value21);
        enumMap.put((Enum)akbe.lI, 2131233025);
        enumMap.put((Enum)akbe.kS, 2131233026);
        enumMap.put((Enum)akbe.nb, 2131233027);
        enumMap.put((Enum)akbe.cK, 2131233943);
        enumMap.put((Enum)akbe.iS, 2131233955);
        final akbe io = akbe.io;
        final Integer value24 = 2131232727;
        enumMap.put((Enum)io, value24);
        enumMap.put((Enum)akbe.B, 2131231511);
        enumMap.put((Enum)akbe.fb, 2131231470);
        enumMap.put((Enum)akbe.bN, 2131232949);
        enumMap.put((Enum)akbe.bR, 2131232948);
        enumMap.put((Enum)akbe.hQ, 2131233029);
        enumMap.put((Enum)akbe.hR, 2131233031);
        enumMap.put((Enum)akbe.lf, value20);
        enumMap.put((Enum)akbe.cy, 2131231863);
        enumMap.put((Enum)akbe.fG, 2131232047);
        enumMap.put((Enum)akbe.fH, 2131232046);
        enumMap.put((Enum)akbe.nE, 2131232050);
        enumMap.put((Enum)akbe.fI, 2131232049);
        enumMap.put((Enum)akbe.fJ, 2131232048);
        enumMap.put((Enum)akbe.fQ, 2131233047);
        enumMap.put((Enum)akbe.c, value5);
        enumMap.put((Enum)akbe.d, value);
        enumMap.put((Enum)akbe.md, 2131232066);
        enumMap.put((Enum)akbe.bB, 2131231668);
        enumMap.put((Enum)akbe.g, 2131231513);
        enumMap.put((Enum)akbe.jc, 2131233468);
        enumMap.put((Enum)akbe.kf, 2131233603);
        enumMap.put((Enum)akbe.cc, 2131233467);
        enumMap.put((Enum)akbe.ce, 2131233471);
        enumMap.put((Enum)akbe.jd, 2131233475);
        enumMap.put((Enum)akbe.je, 2131233469);
        enumMap.put((Enum)akbe.kb, 2131232509);
        enumMap.put((Enum)akbe.jU, 2131233036);
        enumMap.put((Enum)akbe.kJ, 2131233044);
        enumMap.put((Enum)akbe.mC, 2131232976);
        enumMap.put((Enum)akbe.mB, 2131232816);
        enumMap.put((Enum)akbe.mN, 2131231911);
        enumMap.put((Enum)akbe.mT, 2131233855);
        enumMap.put((Enum)akbe.nY, 2131232940);
        enumMap.put((Enum)akbe.jl, 2131232537);
        enumMap.put((Enum)akbe.oL, 2131233674);
        enumMap.put((Enum)akbe.oO, value24);
        enumMap.put((Enum)akbe.jX, 2131232522);
        enumMap.put((Enum)akbe.oP, 2131232086);
        enumMap.put((Enum)akbe.oQ, 2131232087);
        enumMap.put((Enum)akbe.oR, 2131232090);
        enumMap.put((Enum)akbe.oS, 2131233526);
        enumMap.put((Enum)akbe.oT, 2131233528);
        enumMap.put((Enum)akbe.oU, 2131233525);
        enumMap.put((Enum)akbe.oV, 2131233524);
        enumMap.put((Enum)akbe.oW, 2131233523);
        enumMap.put((Enum)akbe.oY, 2131233527);
        enumMap.put((Enum)akbe.nU, 2131233474);
        enumMap.put((Enum)akbe.po, 2131233828);
        enumMap.put((Enum)akbe.pq, 2131233946);
        enumMap.put((Enum)akbe.pp, 2131233747);
        enumMap.put((Enum)akbe.pt, 2131233822);
        enumMap.put((Enum)akbe.rA, 2131233834);
        enumMap.put((Enum)akbe.cj, value22);
        enumMap.put((Enum)akbe.ck, 2131233604);
        enumMap.put((Enum)akbe.cm, 2131233605);
        enumMap.put((Enum)akbe.cn, 2131232071);
        enumMap.put((Enum)akbe.co, 2131232072);
        enumMap.put((Enum)akbe.cp, 2131233476);
        enumMap.put((Enum)akbe.rH, 2131231573);
        enumMap.put((Enum)akbe.pA, 2131233675);
        enumMap.put((Enum)akbe.pB, value19);
        enumMap.put((Enum)akbe.qj, 2131233622);
        enumMap.put((Enum)akbe.qk, 2131233765);
        enumMap.put((Enum)akbe.ql, 2131233745);
        enumMap.put((Enum)akbe.qm, 2131233705);
        enumMap.put((Enum)akbe.qo, 2131233867);
        enumMap.put((Enum)akbe.qp, 2131232067);
        enumMap.put((Enum)akbe.qt, 2131233824);
        final akbe bt = akbe.bT;
        int n12 = 2130970950;
        if (PremiumHeaderPatch.getPremiumHeaderOverride()) {
            n12 = 2130970888;
        }
        enumMap.put((Enum)bt, n12);
        enumMap.put((Enum)akbe.cf, 2130970888);
        enumMap.put((Enum)akbe.qF, 2131233624);
        enumMap.put((Enum)akbe.qH, 2131233831);
        enumMap.put((Enum)akbe.hM, 2131233893);
        enumMap.put((Enum)akbe.qP, 2131233952);
        enumMap.put((Enum)akbe.kB, 2131232960);
        enumMap.put((Enum)akbe.qW, 2131233484);
        enumMap.put((Enum)akbe.qY, 2131233482);
        enumMap.put((Enum)akbe.qX, 2131233485);
        enumMap.put((Enum)akbe.qZ, 2131233480);
        enumMap.put((Enum)akbe.iQ, 2131233756);
        enumMap.put((Enum)akbe.rh, 2131233899);
        enumMap.put((Enum)akbe.rG, 2131232547);
        enumMap.put((Enum)akbe.rP, 2131233656);
        enumMap.put((Enum)akbe.lq, 2131233568);
        enumMap.put((Enum)akbe.rz, 2131233672);
        enumMap.put((Enum)akbe.qT, 2131233825);
        enumMap.put((Enum)akbe.sg, 2131233791);
        enumMap.put((Enum)akbe.lp, 2131232538);
        enumMap.put((Enum)akbe.oZ, 2131231538);
        enumMap.put((Enum)akbe.pa, 2131231541);
        enumMap.put((Enum)akbe.pb, 2131231542);
        enumMap.put((Enum)akbe.pc, 2131231539);
        enumMap.put((Enum)akbe.pd, 2131231540);
        enumMap.put((Enum)akbe.pe, 2131231549);
        enumMap.put((Enum)akbe.pf, 2131231552);
        enumMap.put((Enum)akbe.pg, 2131231553);
        enumMap.put((Enum)akbe.ph, 2131231550);
        enumMap.put((Enum)akbe.pi, 2131231551);
        enumMap.put((Enum)akbe.pj, 2131231544);
        enumMap.put((Enum)akbe.pk, 2131231547);
        enumMap.put((Enum)akbe.pl, 2131231548);
        enumMap.put((Enum)akbe.pm, 2131231545);
        enumMap.put((Enum)akbe.pn, 2131231546);
        return enumMap;
    }
    
    public final int a(final akbe akbe) {
        return (int)Map$_EL.getOrDefault((Map)this.a, (Object)akbe, (Object)0);
    }
    
    public final int b(final akbe akbe, final boolean b) {
        int n;
        if (b && this.b.containsKey(akbe)) {
            n = this.b.get(akbe);
        }
        else {
            n = this.a(akbe);
        }
        return n;
    }
}
