import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwz extends ahcz implements aheo
{
    public static final apwz a;
    private static volatile ahev l;
    public int b;
    public Object c;
    public String d;
    public boolean e;
    public int f;
    public int g;
    public ahej h;
    public ahdp i;
    public aisc j;
    public int k;
    private int m;
    private ahjl n;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(apwz.class, a = new apwz());
    }
    
    private apwz() {
        this.b = 0;
        this.h = ahej.a;
        this.o = 2;
        this.d = "";
        this.i = ahcz.emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev l;
                if ((l = apwz.l) == null) {
                    synchronized (apwz.class) {
                        if (apwz.l == null) {
                            apwz.l = (ahev)new ahcs((ahcz)apwz.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return apwz.a;
            }
            case 4: {
                return new ahcr((ahcz)apwz.a);
            }
            case 3: {
                return new apwz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwz.a, "\u0001\u000b\u0001\u0001\u0001\u000e\u000b\u0001\u0001\u0004\u0001\u103c\u0000\u0002\u1007\u0003\u0003\u1409\u0006\u0004\u1409\f\u0006\u100c\u0004\u0007\u1008\u0000\b\u0432\t\u041b\n\u100c\u0005\u000b\u100c\u0007\u000e\u103b\u0000", new Object[] { "c", "b", "m", afqi.class, "e", "j", "n", "f", apvm.d, "d", "h", apwy.a, "i", apxa.class, "g", apvm.d, "k", apvm.f });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
