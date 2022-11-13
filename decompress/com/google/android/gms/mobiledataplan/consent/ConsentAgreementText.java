// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ConsentAgreementText extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public SafeHtml a;
    public SafeHtml[] b;
    public SafeHtml[] c;
    public String d;
    public String e;
    public String f;
    public int g;
    public String h;
    
    static {
        CREATOR = (Parcelable$Creator)new njy(8);
    }
    
    private ConsentAgreementText() {
    }
    
    public ConsentAgreementText(final SafeHtml a, final SafeHtml[] b, final SafeHtml[] c, final String d, final String e, final String f, final int g, final String h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof ConsentAgreementText) {
            final ConsentAgreementText consentAgreementText = (ConsentAgreementText)o;
            if (khl.be((Object)this.a, (Object)consentAgreementText.a) && Arrays.equals(this.b, consentAgreementText.b) && Arrays.equals(this.c, consentAgreementText.c) && khl.be((Object)this.d, (Object)consentAgreementText.d) && khl.be((Object)this.e, (Object)consentAgreementText.e) && khl.be((Object)this.f, (Object)consentAgreementText.f) && khl.be((Object)this.g, (Object)consentAgreementText.g) && khl.be((Object)this.h, (Object)consentAgreementText.h)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, Arrays.hashCode(this.b), Arrays.hashCode(this.c), this.d, this.e, this.f, this.g });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        khl.bg("Title", (Object)this.a, (List)list);
        khl.bg("DescriptionParagraphs", (Object)Arrays.toString(this.b), (List)list);
        khl.bg("AdditionalInfoParagraphs", (Object)Arrays.toString(this.c), (List)list);
        khl.bg("PositiveButtonCaption", (Object)this.d, (List)list);
        khl.bg("NegativeButtonCaption", (Object)this.e, (List)list);
        khl.bg("ContinueButtonCaption", (Object)this.f, (List)list);
        khl.bg("Version", (Object)this.g, (List)list);
        khl.bg("TextId", (Object)this.h, (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.af(parcel, 1, (Parcelable)this.a, n);
        khl.aj(parcel, 2, (Parcelable[])this.b, n);
        khl.aj(parcel, 3, (Parcelable[])this.c, n);
        khl.ag(parcel, 4, this.d);
        khl.ag(parcel, 5, this.e);
        khl.ag(parcel, 6, this.f);
        khl.S(parcel, 7, this.g);
        khl.ag(parcel, 8, this.h);
        khl.N(parcel, m);
    }
}
