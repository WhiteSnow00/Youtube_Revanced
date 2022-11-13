// 
// Decompiled by Procyon v0.6.0
// 

final class bxu extends bxl implements Comparable
{
    public long h;
    
    public bxu() {
    }
    
    public final /* bridge */ int compareTo(final Object o) {
        final bxu bxu = (bxu)o;
        final boolean endOfStream = ((bcw)this).isEndOfStream();
        final boolean endOfStream2 = ((bcw)bxu).isEndOfStream();
        int n = -1;
        if (endOfStream != endOfStream2) {
            if (((bcw)this).isEndOfStream()) {
                return 1;
            }
        }
        else {
            long n2;
            if ((n2 = this.e - bxu.e) == 0L && (n2 = this.h - bxu.h) == 0L) {
                n = 0;
            }
            else if (n2 > 0L) {
                return 1;
            }
        }
        return n;
    }
}
