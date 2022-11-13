import android.content.SharedPreferences;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.libraries.youtube.metadataeditor.thumbnail.ShortsEditThumbnailController;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class hty implements rc
{
    final htz a;
    
    public hty(final htz a) {
        this.a = a;
    }
    
    public final void a(final Context context) {
        final htz a = this.a;
        if (!a.g) {
            a.g = true;
            final Object ar = a.aR();
            final UploadActivity uploadActivity = (UploadActivity)a;
            final esp esp = (esp)ar;
            ((faq)uploadActivity).a = (trc)esp.b.dj.a();
            ((faq)uploadActivity).b = (fxh)esp.S.a();
            ((faq)uploadActivity).e = (pja)esp.b.a.c.a();
            ((faq)uploadActivity).c = (tne)esp.fp.a();
            ((faq)uploadActivity).d = arlr.b(esp.cs);
            ((faq)uploadActivity).f = (elx)esp.N.a();
            ((huc)uploadActivity).O = (otk)esp.b.fR.a();
            esp.bM();
            ((huc)uploadActivity).P = (tqd)esp.b.ix.a();
            ((huc)uploadActivity).Q = (tgd)esp.b.h.a();
            ((huc)uploadActivity).R = (ashi)esp.b.a.aC.a();
            ((huc)uploadActivity).ah = (ziy)esp.b.ln.a();
            ((huc)uploadActivity).ag = (arwh)esp.b.v.a();
            ((huc)uploadActivity).S = (acps)esp.Y.a();
            ((huc)uploadActivity).T = esp.fu;
            ((huc)uploadActivity).U = (wyw)esp.b.iK.a();
            ((huc)uploadActivity).V = (acqg)esp.as.a();
            ((huc)uploadActivity).ai = esp.Am();
            ((huc)uploadActivity).W = (acuq)esp.b.a.bl.a();
            ((huc)uploadActivity).aj = (aeea)esp.ao.a();
            ((huc)uploadActivity).X = (acrr)esp.dz.a();
            ((huc)uploadActivity).ak = (aeea)esp.b.kb.a();
            ((huc)uploadActivity).ab = (ShortsEditThumbnailController)esp.ek.a();
            uploadActivity.h = (afvs)esp.b.r.a();
            uploadActivity.i = (vcy)esp.F.a();
            uploadActivity.j = (acnc)esp.bS.a();
            uploadActivity.au = (adkp)esp.b.a.I.a();
            uploadActivity.k = (zmf)esp.b.aC.a();
            uploadActivity.l = (acgs)esp.b.jl.a();
            uploadActivity.m = (vlq)esp.b.gn.a();
            uploadActivity.n = esp.ap();
            uploadActivity.o = (zgb)esp.dZ.a();
            uploadActivity.p = (zmt)esp.b.pz.a();
            uploadActivity.q = (xac)esp.ei.a();
            uploadActivity.r = (rgs)esp.cT.a();
            final UploadActivity o = esp.O();
            final afvs afvs = (afvs)esp.b.r.a();
            final tjm tjm = (tjm)esp.b.P.a();
            final ziy ziy = (ziy)esp.b.ln.a();
            final aldf b = esp.b.a.B();
            final arwh arwh = (arwh)esp.b.v.a();
            final adfq adfq = (adfq)esp.b.a.dB.a();
            final adkp adkp = (adkp)esp.b.a.I.a();
            final uqb ap = esp.ap();
            final adia adia = (adia)esp.b.ey.a();
            final adkb adkb = (adkb)esp.b.lo.a();
            final adlp adlp = (adlp)esp.b.li.a();
            final adjx au = esp.aU();
            final gbc gbc = (gbc)esp.aS.a();
            final gbu gbu = (gbu)esp.aT.a();
            final zmf zmf = (zmf)esp.b.aC.a();
            final aujg aujg = (aujg)esp.b.a.J.a();
            final adet adet = (adet)esp.b.lh.a();
            final acuq acuq = (acuq)esp.b.a.bl.a();
            final atke fz = esp.fz;
            final rlc rlc = (rlc)esp.b.a.dC.a();
            uploadActivity.s = new hun(o, afvs, tjm, ziy, b, arwh, adfq, adkp, ap, adia, adkb, adlp, au, gbc, gbu, zmf, aujg, adet, acuq, fz, (atjm)esp.fs.a(), (hts)esp.fx.a(), (zhk)esp.fr.a(), (ucs)esp.ej.a(), (aeea)esp.b.kb.a(), (wyw)esp.ei.a(), null, null, null, null, null, null, null);
            uploadActivity.t = (adlm)esp.b.a.L.a();
            uploadActivity.ay = (c)esp.b.kz.a();
            uploadActivity.u = (SharedPreferences)esp.b.d.a();
            uploadActivity.az = esp.zi();
            uploadActivity.as = (qqr)esp.b.a.dW.a();
            uploadActivity.v = (acwt)esp.V.a();
            uploadActivity.w = (adlp)esp.b.li.a();
            uploadActivity.aw = (adet)esp.b.lh.a();
            uploadActivity.x = (adet)esp.b.a.dX.a();
            uploadActivity.y = (fxw)esp.G.a();
            uploadActivity.z = (htk)esp.fy.a();
            uploadActivity.av = (kja)esp.ft.a();
            final ziy ziy2 = (ziy)esp.U.a();
            uploadActivity.A = (hts)esp.fx.a();
            uploadActivity.B = esp.I;
            uploadActivity.aA = esp.zI();
            final zhk zhk = (zhk)esp.fr.a();
            uploadActivity.C = esp.aU();
            uploadActivity.D = (gkx)esp.b.fr.a();
            uploadActivity.at = (vai)esp.b.ka.a();
            uploadActivity.K = (zei)esp.eq.a();
            uploadActivity.ax = new heo((ziy)esp.U.a(), (wyw)esp.ei.a(), (vcy)esp.F.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        }
    }
}
