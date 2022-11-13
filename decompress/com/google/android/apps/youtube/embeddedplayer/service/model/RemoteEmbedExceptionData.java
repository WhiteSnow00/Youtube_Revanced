// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class RemoteEmbedExceptionData implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final Throwable a;
    private Throwable b;
    
    static {
        CREATOR = (Parcelable$Creator)new f(2);
    }
    
    public RemoteEmbedExceptionData(final Parcel parcel) {
        this.b = null;
        this.a = (Throwable)parcel.readSerializable();
    }
    
    public RemoteEmbedExceptionData(final Throwable a) {
        this.b = null;
        this.a = a;
    }
    
    private static BadParcelableException b(final String s, final Exception ex) {
        final BadParcelableException ex2 = new BadParcelableException(s);
        ex2.initCause((Throwable)ex);
        return ex2;
    }
    
    public final Throwable a(String string) {
        final Throwable b = this.b;
        if (b != null) {
            return b;
        }
        final Throwable a = this.a;
        if (a == null) {
            return null;
        }
        final String canonicalName = a.getClass().getCanonicalName();
        try {
            final String message = this.a.getMessage();
            final StringBuilder sb = new StringBuilder("Pkg: ");
            sb.append(string);
            sb.append(" ");
            sb.append(message);
            string = sb.toString();
            final Throwable b2 = (Throwable)Class.forName(tvb.i(canonicalName)).getConstructor(String.class).newInstance(tvb.i(string));
            b2.initCause(this.a.getCause());
            b2.setStackTrace(this.a.getStackTrace());
            return this.b = b2;
        }
        catch (final InvocationTargetException ex) {
            throw b("Exception thrown by invoked constructor for RemoteEmbedExceptionData exception: ".concat(String.valueOf(canonicalName)), ex);
        }
        catch (final NoSuchMethodException ex2) {
            throw b("Could not find right constructor for RemoteEmbedExceptionData exception: ".concat(String.valueOf(canonicalName)), ex2);
        }
        catch (final ClassNotFoundException ex3) {
            throw b("Unable to find exception class for RemoteEmbedExceptionData exception: ".concat(String.valueOf(canonicalName)), ex3);
        }
        catch (final InstantiationException ex4) {
            throw b("Unable to instantiate RemoteEmbedExceptionData exception: ".concat(String.valueOf(canonicalName)), ex4);
        }
        catch (final IllegalAccessException ex5) {
            throw b("Unable to call constructor for RemoteEmbedExceptionData exception: ".concat(String.valueOf(canonicalName)), ex5);
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeSerializable((Serializable)this.a);
    }
}
