import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ambg extends ahcz implements aheo
{
    public static final ambg a;
    public static final ahcx b;
    private static volatile ahev m;
    public int c;
    public ahbt d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    
    static {
        final ambg a2 = new ambg();
        ahcz.registerDefaultInstance(ambg.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)amwo.b, a2, (MessageLite)a2, null, 403433066, ahgc.k, ambg.class);
    }
    
    private ambg() {
        this.d = ahbt.b;
    }
    
    public static void a(final ambg ambg) {
        ambg.c |= 0x40;
        ambg.j = true;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = ambg.m) == null) {
                    synchronized (ambg.class) {
                        if (ambg.m == null) {
                            ambg.m = (ahev)new ahcs((ahcz)ambg.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ambg.a;
            }
            case 4: {
                return new ahcr((ahcz)ambg.a);
            }
            case 3: {
                return new ambg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ambg.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100c\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u100c\u0004\u0006\u1007\u0005\u0007\u1007\u0006\b\u1004\u0007\n\u1007\t", new Object[] { "c", "d", "e", amze.a(), "f", "g", "h", amwi.p, "i", "j", "k", "l" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
