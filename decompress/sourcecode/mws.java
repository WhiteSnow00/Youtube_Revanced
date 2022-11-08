import java.util.List;
import android.os.Bundle;
import android.app.ApplicationErrorReport;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.feedback.LogOptions;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.feedback.FeedbackOptions;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mws implements Parcelable$Creator
{
    public static void a(final FeedbackOptions feedbackOptions, final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ac(parcel, 2, feedbackOptions.a);
        kgk.R(parcel, 3, feedbackOptions.b);
        kgk.ac(parcel, 5, feedbackOptions.c);
        kgk.ab(parcel, 6, (Parcelable)feedbackOptions.d, n);
        kgk.ac(parcel, 7, feedbackOptions.e);
        kgk.ab(parcel, 8, (Parcelable)feedbackOptions.f, n);
        kgk.ac(parcel, 9, feedbackOptions.g);
        kgk.ag(parcel, 10, feedbackOptions.h);
        kgk.K(parcel, 11, feedbackOptions.i);
        kgk.ab(parcel, 12, (Parcelable)feedbackOptions.j, n);
        kgk.ab(parcel, 13, (Parcelable)feedbackOptions.k, n);
        kgk.K(parcel, 14, feedbackOptions.l);
        kgk.ab(parcel, 15, (Parcelable)feedbackOptions.m, n);
        kgk.ac(parcel, 16, feedbackOptions.n);
        kgk.K(parcel, 17, feedbackOptions.o);
        kgk.P(parcel, 18, feedbackOptions.p);
        kgk.K(parcel, 19, feedbackOptions.q);
        kgk.J(parcel, i);
    }
}
