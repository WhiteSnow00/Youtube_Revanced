import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyc extends ahcz implements aheo
{
    public static final akyc a;
    private static volatile ahev k;
    public int b;
    public aknh c;
    public String d;
    public String e;
    public String f;
    public int g;
    public ahbt h;
    public akyb i;
    public ahxu j;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(akyc.class, a = new akyc());
    }
    
    private akyc() {
        this.l = 2;
        this.d = "";
        this.e = "";
        this.f = "";
        this.h = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = akyc.k) == null) {
                    synchronized (akyc.class) {
                        if (akyc.k == null) {
                            akyc.k = (ahev)new ahcs((ahcz)akyc.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return akyc.a;
            }
            case 4: {
                return new ahcr((ahcz)akyc.a);
            }
            case 3: {
                return new akyc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyc.a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0006\u1008\u0004\u0007\u1004\u0005\b\u100a\u0006\t\u1009\u0007\n\u1009\b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
