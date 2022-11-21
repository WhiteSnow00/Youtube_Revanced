import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhg extends ahcz implements aheo
{
    public static final alhg a;
    private static volatile ahev i;
    public int b;
    public aknj c;
    public algy d;
    public alhn e;
    public ahdp f;
    public ahbt g;
    public int h;
    private akmh j;
    private ahjl k;
    private ajxn l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(alhg.class, a = new alhg());
    }
    
    private alhg() {
        this.m = 2;
        this.f = ahcz.emptyProtobufList();
        ahcz.emptyProtobufList();
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
                final ahev i;
                if ((i = alhg.i) == null) {
                    synchronized (alhg.class) {
                        if (alhg.i == null) {
                            alhg.i = (ahev)new ahcs((ahcz)alhg.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alhg.a;
            }
            case 4: {
                return new ahcr((ahcz)alhg.a);
            }
            case 3: {
                return new alhg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhg.a, "\u0001\t\u0000\u0001\u0001\u0309\t\u0000\u0001\u0007\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u100a\u0004\u0007\u041b\b\u1409\u0005\n\u100c\u0006\u0309\u1409\u0007", new Object[] { "b", "c", "d", "j", "e", "g", "f", aisc.class, "k", "h", apvm.o, "l" });
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
