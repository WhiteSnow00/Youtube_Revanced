// 
// Decompiled by Procyon v0.6.0
// 

public final class adqp implements adqy
{
    private final int a;
    
    public adqp(final int a) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final adne adne) {
        final int a = this.a;
        final boolean b = true;
        final boolean b2 = true;
        if (a != 0) {
            final adoj a2 = adne.a;
            final adoj b3 = adne.b;
            if (b3 != null) {
                boolean b5 = false;
                Label_0076: {
                    if (a2 != null) {
                        final int b4 = a2.b;
                        if ((b4 & 0x80) != 0x0 && (b4 & 0x4) != 0x0 && (b4 & 0x2) != 0x0) {
                            b5 = true;
                            break Label_0076;
                        }
                    }
                    b5 = false;
                }
                final int b6 = b3.b;
                boolean b7 = (b6 & 0x80) != 0x0 && (b6 & 0x4) != 0x0 && (b6 & 0x2) != 0x0;
                if (!b5) {
                    return b7;
                }
                if (b7) {
                    a2.getClass();
                    adoh adoh;
                    if ((adoh = adoh.a(a2.l)) == null) {
                        adoh = adoh.a;
                    }
                    adoh adoh2;
                    if ((adoh2 = adoh.a(b3.l)) == null) {
                        adoh2 = adoh.a;
                    }
                    b7 = b2;
                    if (adoh != adoh2) {
                        return b7;
                    }
                    b7 = b2;
                    if (!a2.g.equals(b3.g)) {
                        return b7;
                    }
                    if (!a2.f.equals(b3.f)) {
                        b7 = b2;
                        return b7;
                    }
                    return false;
                }
            }
            return false;
        }
        final adoj a3 = adne.a;
        final adoj b8 = adne.b;
        if (b8 != null) {
            boolean b10 = false;
            Label_0294: {
                if (a3 != null) {
                    final int b9 = a3.b;
                    if ((b9 & 0x80) != 0x0 && (b9 & 0x4) != 0x0 && (b9 & 0x2) != 0x0) {
                        b10 = true;
                        break Label_0294;
                    }
                }
                b10 = false;
            }
            final int b11 = b8.b;
            boolean b12 = (b11 & 0x80) != 0x0 && (b11 & 0x4) != 0x0 && (b11 & 0x2) != 0x0;
            if (!b10) {
                return b12;
            }
            if (b12) {
                a3.getClass();
                adoh adoh3;
                if ((adoh3 = adoh.a(a3.l)) == null) {
                    adoh3 = adoh.a;
                }
                adoh adoh4;
                if ((adoh4 = adoh.a(b8.l)) == null) {
                    adoh4 = adoh.a;
                }
                b12 = b;
                if (adoh3 != adoh4) {
                    return b12;
                }
                b12 = b;
                if (!a3.g.equals(b8.g)) {
                    return b12;
                }
                if (!a3.f.equals(b8.f)) {
                    b12 = b;
                    return b12;
                }
                return false;
            }
        }
        return false;
    }
    
    @Override
    public final admm b() {
        if (this.a != 0) {
            return adqo.b;
        }
        return adqo.a;
    }
}
