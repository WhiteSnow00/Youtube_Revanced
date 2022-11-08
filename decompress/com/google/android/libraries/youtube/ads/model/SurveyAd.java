// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.ads.model;

import com.google.protobuf.MessageLite;
import android.os.Parcel;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import com.google.protos.youtube.api.innertube.SurveyTextInterstitialRendererOuterClass;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import android.os.Parcelable$Creator;

public class SurveyAd extends MediaBreakAd implements vff
{
    public static final Parcelable$Creator CREATOR;
    public static final sev a;
    public final aoml b;
    public final aonv c;
    public final afcr d;
    public final int e;
    
    static {
        CREATOR = (Parcelable$Creator)new qzp(10);
        a = (sev)new sfq();
    }
    
    public SurveyAd(final InstreamAdBreak instreamAdBreak, final PlayerConfigModel playerConfigModel, final String s, final aoml aoml, final int n) {
        this(instreamAdBreak.f, instreamAdBreak.i, instreamAdBreak.h, instreamAdBreak.g, instreamAdBreak.e, playerConfigModel, s, aoml, n);
    }
    
    public SurveyAd(final String s, final byte[] array, final String s2, final String s3, final boolean b, final PlayerConfigModel playerConfigModel, final String s4, final aoml b2, final int e) {
        final int size = b2.c.size();
        int i = 0;
        ahlc ahlc = null;
        Label_0117: {
            if (size > 0) {
                final aomn aomn = b2.c.get(0);
                if ((aomn.b & 0x1) != 0x0) {
                    aomk aomk;
                    if ((aomk = aomn.c) == null) {
                        aomk = aomk.a;
                    }
                    aomm aomm;
                    if ((aomm = aomk.g) == null) {
                        aomm = aomm.a;
                    }
                    if ((ahlc = aomm.e) == null) {
                        ahlc = ahlc.a;
                    }
                    break Label_0117;
                }
            }
            ahlc = ahlc.a;
        }
        super(s, array, s2, s3, b, playerConfigModel, s4, new VideoAdTrackingModel(ahlc));
        b2.getClass();
        this.b = b2;
        anss anss;
        if ((anss = b2.e) == null) {
            anss = anss.a;
        }
        this.c = (aonv)aaiy.w(anss, (agyr)SurveyTextInterstitialRendererOuterClass.surveyTextInterstitialRenderer);
        final ArrayList list = new ArrayList();
        while (i < b2.c.size()) {
            final aomn aomn2 = b2.c.get(i);
            if ((aomn2.b & 0x1) != 0x0) {
                aomk aomk2;
                if ((aomk2 = aomn2.c) == null) {
                    aomk2 = aomk.a;
                }
                list.add(new SurveyQuestionRendererModel(aomk2, i));
            }
            ++i;
        }
        this.d = afcr.o((Collection)list);
        this.e = e;
    }
    
    public final agyc C() {
        return this.b.j;
    }
    
    public final aioe E() {
        final aoml b = this.b;
        if ((b.b & 0x1) != 0x0) {
            aioe aioe;
            if ((aioe = b.d) == null) {
                aioe = aioe.a;
            }
            return aioe;
        }
        return null;
    }
    
    public final aioe F() {
        final aoml b = this.b;
        if ((b.b & 0x4) != 0x0) {
            aioe aioe;
            if ((aioe = b.f) == null) {
                aioe = aioe.a;
            }
            return aioe;
        }
        return null;
    }
    
    public final List aA() {
        return this.b.n;
    }
    
    public final boolean aB() {
        final aoml b = this.b;
        return (b.b & 0x200) == 0x0 || b.l;
    }
    
    public final boolean aC() {
        return this.b.g;
    }
    
    public final aomi ax() {
        aomi aomi;
        if ((aomi = aomi.b(this.b.k)) == null) {
            aomi = aomi.a;
        }
        return aomi;
    }
    
    public final List ay() {
        return this.b.m;
    }
    
    public final List az() {
        return (List)this.d;
    }
    
    public final int c() {
        if (!this.d.isEmpty()) {
            return this.u(0).a();
        }
        return 0;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof SurveyAd)) {
            return false;
        }
        final SurveyAd surveyAd = (SurveyAd)o;
        return super.equals((Object)surveyAd) && aeda.v((Object)this.b, (Object)surveyAd.b);
    }
    
    public final ahjr o() {
        final aoml b = this.b;
        if ((b.b & 0x20) != 0x0) {
            ahjr ahjr;
            if ((ahjr = b.i) == null) {
                ahjr = ahjr.a;
            }
            return ahjr;
        }
        return null;
    }
    
    public final int p() {
        return this.e;
    }
    
    public final int r() {
        return this.u(0).c() * 1000;
    }
    
    public final int s() {
        if (!this.d.isEmpty()) {
            return this.u(0).c();
        }
        return 5;
    }
    
    public final SurveyQuestionRendererModel u(final int n) {
        if (n >= this.d.size()) {
            trn.l("Trying to retrieve question that is out of range.");
            return null;
        }
        return (SurveyQuestionRendererModel)this.d.get(n);
    }
    
    public final ahld v() {
        ahld ahld;
        if ((ahld = this.b.h) == null) {
            ahld = ahld.a;
        }
        return ahld;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        uji.ag((MessageLite)this.b, parcel);
        parcel.writeInt(this.e);
    }
}
