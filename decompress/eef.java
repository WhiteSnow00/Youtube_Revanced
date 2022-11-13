// 
// Decompiled by Procyon v0.6.0
// 

final class eef implements eeg
{
    private final int c;
    
    public eef(final int c) {
        this.c = c;
    }
    
    public final void a(int n, final edi edi) {
        int n2 = n;
        if (this.c != 0) {
            for (int n3 = 0; n3 < n && edi.a(n3); ++n3) {}
            return;
        }
        do {
            n = n2 - 1;
            if (n < 0) {
                break;
            }
            n2 = n;
        } while (edi.a(n));
    }
}
