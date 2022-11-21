import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apga extends ahcz implements aheo
{
    public static final apga a;
    private static volatile ahev h;
    public int b;
    public int c;
    public Object d;
    public ajws e;
    public aisc f;
    public ahbt g;
    private ajws i;
    private ajws j;
    private ajws k;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(apga.class, a = new apga());
    }
    
    private apga() {
        this.c = 0;
        this.m = 2;
        this.g = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = apga.h) == null) {
                    synchronized (apga.class) {
                        if (apga.h == null) {
                            apga.h = (ahev)new ahcs((ahcz)apga.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return apga.a;
            }
            case 4: {
                return new ahcr((ahcz)apga.a);
            }
            case 3: {
                return new apga();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apga.a, "\u0001\n\u0001\u0001\u0001\f\n\u0000\u0000\t\u0001\u143c\u0000\u0002\u143c\u0000\u0003\u1409\u0003\u0004\u1409\b\u0005\u100a\t\u0006\u1409\n\u0007\u1409\u0004\t\u1409\u0005\n\u143c\u0000\f\u1409\u0006", new Object[] { "d", "c", "b", aowb.class, akfj.class, "e", "f", "g", "l", "i", "j", aphl.class, "k" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
