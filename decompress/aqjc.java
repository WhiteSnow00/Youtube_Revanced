import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjc extends ahcz implements aheo
{
    public static final aqjc a;
    private static volatile ahev g;
    public int b;
    public ahdp c;
    public int d;
    public boolean e;
    public int f;
    private aqjd h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aqjc.class, a = new aqjc());
    }
    
    private aqjc() {
        this.i = 2;
        this.c = ahcz.emptyProtobufList();
    }
    
    public final void a() {
        final ahdp c = this.c;
        if (!c.c()) {
            this.c = ahcz.mutableCopy(c);
        }
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aqjc.g) == null) {
                    synchronized (aqjc.class) {
                        if (aqjc.g == null) {
                            aqjc.g = (ahev)new ahcs((ahcz)aqjc.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqjc.a;
            }
            case 4: {
                return new ahcr((char[][][])null, (byte[][][])null);
            }
            case 3: {
                return new aqjc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjc.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u001b\u0002\u100c\u0000\u0003\u1409\u0001\u0004\u1007\u0002\u0005\u100c\u0003", new Object[] { "b", "c", aqje.class, "d", aqdx.r, "h", "e", "f", aqdx.s });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
