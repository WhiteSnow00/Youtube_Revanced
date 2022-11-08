// 
// Decompiled by Procyon v0.6.0
// 

public final class pqk
{
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    
    public pqk() {
    }
    
    public pqk(final Integer a, final Integer b, final Integer c, final boolean b2, final boolean b3, final boolean b4, final boolean b5, final String s, final String s2, final String j, final int n, final int n2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = "com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayActivity";
        this.i = "com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayBroadcastReceiver";
        this.j = j;
        this.l = 2;
        this.k = 1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof pqk) {
            final pqk pqk = (pqk)o;
            if (this.a.equals(pqk.a) && this.b.equals(pqk.b)) {
                final Integer c = this.c;
                if (c == null) {
                    if (pqk.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(pqk.c)) {
                    return false;
                }
                if (this.d == pqk.d && this.e == pqk.e && this.f == pqk.f && this.g == pqk.g) {
                    final String h = this.h;
                    if (h == null) {
                        if (pqk.h != null) {
                            return false;
                        }
                    }
                    else if (!h.equals(pqk.h)) {
                        return false;
                    }
                    final String i = this.i;
                    if (i == null) {
                        if (pqk.i != null) {
                            return false;
                        }
                    }
                    else if (!i.equals(pqk.i)) {
                        return false;
                    }
                    final String j = this.j;
                    if (j == null) {
                        if (pqk.j != null) {
                            return false;
                        }
                    }
                    else if (!j.equals(pqk.j)) {
                        return false;
                    }
                    final int l = this.l;
                    final int k = pqk.l;
                    if (l == 0) {
                        throw null;
                    }
                    if (l == k && this.k == pqk.k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final Integer c = this.c;
        int hashCode3 = 0;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final boolean d = this.d;
        int n = 1231;
        int n2;
        if (!d) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.e) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        int n4;
        if (!this.f) {
            n4 = 1237;
        }
        else {
            n4 = 1231;
        }
        if (!this.g) {
            n = 1237;
        }
        final String h = this.h;
        int hashCode5;
        if (h == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = h.hashCode();
        }
        final String i = this.i;
        int hashCode6;
        if (i == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = i.hashCode();
        }
        final String j = this.j;
        if (j != null) {
            hashCode3 = j.hashCode();
        }
        final int l = this.l;
        if (l != 0) {
            return ((((((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode4) * 1000003 ^ n2) * -721379959 ^ n3) * 1000003 ^ n4) * -721379959 ^ n) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode3) * 1000003 ^ l) * 1000003 ^ this.k) * 1000003 ^ 0x4D5;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final Integer a = this.a;
        final Integer b = this.b;
        final Integer c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final String h = this.h;
        final String i = this.i;
        final String j = this.j;
        final int l = this.l;
        String s;
        if (l != 1) {
            if (l != 2) {
                s = "null";
            }
            else {
                s = "RESHOW_FROM_LOCAL_STORAGE";
            }
        }
        else {
            s = "CLEAR_SYSTEM_TRAY";
        }
        final int k = this.k;
        final StringBuilder sb = new StringBuilder("SystemTrayNotificationConfig{iconResourceId=");
        sb.append(a);
        sb.append(", appNameResourceId=");
        sb.append(b);
        sb.append(", colorResourceId=");
        sb.append(c);
        sb.append(", soundEnabled=");
        sb.append(d);
        sb.append(", ringtone=null, vibrationEnabled=");
        sb.append(e);
        sb.append(", lightsEnabled=");
        sb.append(f);
        sb.append(", ledColor=null, displayRecipientAccountName=");
        sb.append(g);
        sb.append(", notificationClickedActivity=");
        sb.append(h);
        sb.append(", notificationRemovedReceiver=");
        sb.append(i);
        sb.append(", defaultChannelId=");
        sb.append(j);
        sb.append(", restartBehavior=");
        sb.append(s);
        sb.append(", defaultGroupThreshold=");
        sb.append(k);
        sb.append(", shouldFilterOldThreads=false}");
        return sb.toString();
    }
}
