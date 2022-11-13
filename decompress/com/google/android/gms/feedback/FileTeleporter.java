// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.feedback;

import android.os.Parcelable;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import android.os.Parcel;
import java.io.IOException;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FileTeleporter extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    ParcelFileDescriptor a;
    final String b;
    final String c;
    public File d;
    
    static {
        CREATOR = (Parcelable$Creator)new mvv(4);
    }
    
    public FileTeleporter(final ParcelFileDescriptor a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    static final void a(final Closeable closeable) {
        try {
            closeable.close();
        }
        catch (final IOException ex) {
            Log.w("FileTeleporter", "Could not close stream", (Throwable)ex);
        }
    }
    
    public final void writeToParcel(Parcel parcel, final int n) {
        if (this.a == null) {
            final File d = this.d;
            if (d != null) {
                try {
                    final File tempFile = File.createTempFile("teleporter", ".tmp", d);
                    try {
                        final FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
                        this.a = ParcelFileDescriptor.open(tempFile, 268435456);
                        tempFile.delete();
                        parcel = (Parcel)new DataOutputStream(fileOutputStream);
                        try {
                            throw null;
                        }
                        catch (final IOException ex) {
                            throw new IllegalStateException("Could not write into unlinked file", ex);
                        }
                        a((Closeable)parcel);
                    }
                    catch (final FileNotFoundException ex2) {
                        throw new IllegalStateException("Temporary file is somehow already deleted.");
                    }
                }
                catch (final IOException ex3) {
                    throw new IllegalStateException("Could not create temporary file:", ex3);
                }
            }
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
        }
        final int m = khl.M(parcel);
        khl.af(parcel, 2, (Parcelable)this.a, n);
        khl.ag(parcel, 3, this.b);
        khl.ag(parcel, 4, this.c);
        khl.N(parcel, m);
    }
}
