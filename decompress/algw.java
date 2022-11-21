import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algw extends ahcz implements aheo
{
    public static final algw a;
    private static volatile ahev l;
    public int b;
    public aknh c;
    public String d;
    public String e;
    public String f;
    public String g;
    public ahbt h;
    public ahbt i;
    public aoyk j;
    public ahdp k;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(algw.class, a = new algw());
    }
    
    private algw() {
        this.m = 2;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = ahbt.b;
        this.i = ahbt.b;
        this.k = ahcz.emptyProtobufList();
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
                final ahev l;
                if ((l = algw.l) == null) {
                    synchronized (algw.class) {
                        if (algw.l == null) {
                            algw.l = (ahev)new ahcs((ahcz)algw.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return algw.a;
            }
            case 4: {
                return new ahcr((float[][][])null, (int[][])null);
            }
            case 3: {
                return new algw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algw.a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0006\u100a\u0005\u0007\u100a\u0006\b\u1008\u0003\t\u1008\u0004\r\u1009\b\u000e\u001c", new Object[] { "b", "c", "d", "e", "h", "i", "f", "g", "j", "k" });
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
