// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.ads.model;

import com.google.protobuf.MessageLite;
import android.os.Parcel;
import java.util.Locale;
import java.util.Arrays;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class SurveyQuestionRendererModel implements Parcelable, vhg
{
    public static final Parcelable$Creator CREATOR;
    public final aoon a;
    private final int b;
    private List c;
    private List d;
    
    static {
        CREATOR = (Parcelable$Creator)new rhy(10);
    }
    
    public SurveyQuestionRendererModel(final aoon a, final int b) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public final int a() {
        aoop aoop;
        if ((aoop = this.a.g) == null) {
            aoop = aoop.a;
        }
        if (aoop.b <= 0) {
            return 15;
        }
        aoop aoop2;
        if ((aoop2 = this.a.g) == null) {
            aoop2 = aoop.a;
        }
        return aoop2.b;
    }
    
    public final int b() {
        return this.b;
    }
    
    public final int c() {
        aoop aoop;
        if ((aoop = this.a.g) == null) {
            aoop = aoop.a;
        }
        if (aoop.c <= 0) {
            return 0;
        }
        aoop aoop2;
        if ((aoop2 = this.a.g) == null) {
            aoop2 = aoop.a;
        }
        return aoop2.c;
    }
    
    public final String d() {
        final aoon a = this.a;
        final int n = a.b & 0x1;
        if (n != 0) {
            ajut ajut;
            if (n != 0) {
                if ((ajut = a.c) == null) {
                    ajut = ajut.a;
                }
            }
            else {
                ajut = null;
            }
            return acak.b(ajut).toString();
        }
        ttr.b("Survey question doesn't contain any question text.");
        return "";
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final List e() {
        if (this.c == null) {
            this.c = new ArrayList();
            final Iterator<Object> iterator = ((List<Object>)this.a.d).iterator();
            while (iterator.hasNext()) {
                this.c.add(acak.b((ajut)iterator.next()).toString());
            }
        }
        return Collections.unmodifiableList((List<?>)this.c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof SurveyQuestionRendererModel)) {
            return false;
        }
        final SurveyQuestionRendererModel surveyQuestionRendererModel = (SurveyQuestionRendererModel)o;
        return adkp.ae(this.a, surveyQuestionRendererModel.a) && this.b == surveyQuestionRendererModel.b;
    }
    
    public final List f() {
        if ((this.a.b & 0x20) != 0x0) {
            if (this.d == null) {
                this.d = new ArrayList();
                aoop aoop;
                if ((aoop = this.a.g) == null) {
                    aoop = aoop.a;
                }
                for (final ahmw ahmw : aoop.d) {
                    try {
                        this.d.add(tpe.cK(ahmw.c));
                    }
                    catch (final MalformedURLException ex) {
                        ttr.l("Badly formed uri - ignoring");
                    }
                }
            }
            return this.d;
        }
        return Collections.emptyList();
    }
    
    public final boolean g() {
        return this.a.e > 1;
    }
    
    public final int h() {
        final int e = this.a.e;
        if (e <= 0) {
            return 3;
        }
        if (e == 1) {
            return 1;
        }
        return 2;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    public final void i() {
    }
    
    public final void j() {
    }
    
    @Override
    public final String toString() {
        final Locale us = Locale.US;
        final int b = this.b;
        final int h = this.h();
        String s;
        if (h != 1) {
            if (h != 2) {
                s = "UNSUPPORTED";
            }
            else {
                s = "MULTI_SELECT";
            }
        }
        else {
            s = "SINGLE_ANSWERS";
        }
        return String.format(us, "Question #%d [type: %s question: \"%s\" answers: %s]", b + 1, s, this.d(), this.e());
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        vdh.bp((MessageLite)this.a, parcel);
        parcel.writeInt(this.b);
    }
}
