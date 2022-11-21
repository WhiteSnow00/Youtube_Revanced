import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmk extends ahcz implements aheo
{
    public static final ahmk a;
    private static volatile ahev j;
    public int b;
    public int c;
    public ahdp d;
    public int e;
    public String f;
    public ahdp g;
    public ahdp h;
    public ahov i;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(ahmk.class, a = new ahmk());
    }
    
    private ahmk() {
        this.k = 2;
        this.d = ahcz.emptyProtobufList();
        this.f = "";
        this.g = ahcz.emptyProtobufList();
        this.h = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = ahmk.j) == null) {
                    synchronized (ahmk.class) {
                        if (ahmk.j == null) {
                            ahmk.j = (ahev)new ahcs((ahcz)ahmk.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahmk.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmk.a);
            }
            case 3: {
                return new ahmk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmk.a, "\u0001\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0003\u0001\u0001\u100b\u0000\u0002\u041b\u0003\u100c\u0003\u0004\u1008\u0004\u0006\u001b\u0007\u001b\u000e\u1009\t", new Object[] { "b", "c", "d", ahml.class, "e", ahld.f, "f", "g", ahon.class, "h", ahon.class, "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
