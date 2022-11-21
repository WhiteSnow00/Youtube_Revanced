import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ambf extends ahcz implements aheo
{
    public static final ambf a;
    public static final ahcx b;
    private static volatile ahev j;
    public int c;
    public String d;
    public long e;
    public long f;
    public long g;
    public ahbt h;
    public int i;
    
    static {
        final ambf a2 = new ambf();
        ahcz.registerDefaultInstance(ambf.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 373, ahgc.k, ambf.class);
    }
    
    private ambf() {
        this.d = "";
        final ahbt b = ahbt.b;
        this.h = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = ambf.j) == null) {
                    synchronized (ambf.class) {
                        if (ambf.j == null) {
                            ambf.j = (ahev)new ahcs((ahcz)ambf.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ambf.a;
            }
            case 4: {
                return new ahcr((ahcz)ambf.a);
            }
            case 3: {
                return new ambf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ambf.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1003\u0002\u0004\u1003\u0003\u0005\u1002\u0004\u0006\u100a\u0005\u0007\u100c\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "i", amze.a() });
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
