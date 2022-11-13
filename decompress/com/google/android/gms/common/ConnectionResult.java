// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ConnectionResult extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final ConnectionResult a;
    final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;
    
    static {
        a = new ConnectionResult(0);
        CREATOR = (Parcelable$Creator)new mpg(2);
    }
    
    public ConnectionResult(final int n) {
        this(n, null, null);
    }
    
    public ConnectionResult(final int b, final int c, final PendingIntent d, final String e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public ConnectionResult(final int n, final PendingIntent pendingIntent) {
        this(n, pendingIntent, null);
    }
    
    public ConnectionResult(final int n, final PendingIntent pendingIntent, final String s) {
        this(1, n, pendingIntent, s);
    }
    
    public final boolean a() {
        return this.c != 0 && this.d != null;
    }
    
    public final boolean b() {
        return this.c == 0;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ConnectionResult)) {
            return false;
        }
        final ConnectionResult connectionResult = (ConnectionResult)o;
        return this.c == connectionResult.c && khl.be((Object)this.d, (Object)connectionResult.d) && khl.be((Object)this.e, (Object)connectionResult.e);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.c, this.d, this.e });
    }
    
    public final String toString() {
        final ArrayList list = new ArrayList();
        final int c = this.c;
        String string = null;
        Label_0346: {
            if (c != 99) {
                if (c != 1500) {
                    switch (c) {
                        default: {
                            switch (c) {
                                default: {
                                    final StringBuilder sb = new StringBuilder("UNKNOWN_ERROR_CODE(");
                                    sb.append(c);
                                    sb.append(")");
                                    string = sb.toString();
                                    break Label_0346;
                                }
                                case 24: {
                                    string = "API_DISABLED_FOR_CONNECTION";
                                    break Label_0346;
                                }
                                case 23: {
                                    string = "API_DISABLED";
                                    break Label_0346;
                                }
                                case 22: {
                                    string = "RESOLUTION_ACTIVITY_NOT_FOUND";
                                    break Label_0346;
                                }
                                case 21: {
                                    string = "API_VERSION_UPDATE_REQUIRED";
                                    break Label_0346;
                                }
                                case 20: {
                                    string = "RESTRICTED_PROFILE";
                                    break Label_0346;
                                }
                                case 19: {
                                    string = "SERVICE_MISSING_PERMISSION";
                                    break Label_0346;
                                }
                                case 18: {
                                    string = "SERVICE_UPDATING";
                                    break Label_0346;
                                }
                                case 17: {
                                    string = "SIGN_IN_FAILED";
                                    break Label_0346;
                                }
                                case 16: {
                                    string = "API_UNAVAILABLE";
                                    break Label_0346;
                                }
                                case 15: {
                                    string = "INTERRUPTED";
                                    break Label_0346;
                                }
                                case 14: {
                                    string = "TIMEOUT";
                                    break Label_0346;
                                }
                                case 13: {
                                    string = "CANCELED";
                                    break Label_0346;
                                }
                            }
                            break;
                        }
                        case 11: {
                            string = "LICENSE_CHECK_FAILED";
                            break;
                        }
                        case 10: {
                            string = "DEVELOPER_ERROR";
                            break;
                        }
                        case 9: {
                            string = "SERVICE_INVALID";
                            break;
                        }
                        case 8: {
                            string = "INTERNAL_ERROR";
                            break;
                        }
                        case 7: {
                            string = "NETWORK_ERROR";
                            break;
                        }
                        case 6: {
                            string = "RESOLUTION_REQUIRED";
                            break;
                        }
                        case 5: {
                            string = "INVALID_ACCOUNT";
                            break;
                        }
                        case 4: {
                            string = "SIGN_IN_REQUIRED";
                            break;
                        }
                        case 3: {
                            string = "SERVICE_DISABLED";
                            break;
                        }
                        case 2: {
                            string = "SERVICE_VERSION_UPDATE_REQUIRED";
                            break;
                        }
                        case 1: {
                            string = "SERVICE_MISSING";
                            break;
                        }
                        case 0: {
                            string = "SUCCESS";
                            break;
                        }
                        case -1: {
                            string = "UNKNOWN";
                            break;
                        }
                    }
                }
                else {
                    string = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
                }
            }
            else {
                string = "UNFINISHED";
            }
        }
        khl.bg("statusCode", (Object)string, (List)list);
        khl.bg("resolution", (Object)this.d, (List)list);
        khl.bg("message", (Object)this.e, (List)list);
        return khl.bf((List)list, (Object)this);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.S(parcel, 1, this.b);
        khl.S(parcel, 2, this.c);
        khl.af(parcel, 3, (Parcelable)this.d, n);
        khl.ag(parcel, 4, this.e);
        khl.N(parcel, m);
    }
}
