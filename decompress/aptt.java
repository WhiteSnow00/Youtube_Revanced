import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptt extends ahcz implements aheo
{
    public static final aptt a;
    private static volatile ahev p;
    public int b;
    public aowb c;
    public aisc d;
    public ajws e;
    public ajws f;
    public ajws g;
    public aich h;
    public ahdp i;
    public aptc j;
    public anxb k;
    public String l;
    public apte m;
    public ahkc n;
    public ahbt o;
    private apie q;
    private ahjl r;
    private byte s;
    
    static {
        ahcz.registerDefaultInstance(aptt.class, a = new aptt());
    }
    
    private aptt() {
        this.s = 2;
        this.i = ahcz.emptyProtobufList();
        this.l = "";
        this.o = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte s = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev p3;
                if ((p3 = aptt.p) == null) {
                    synchronized (aptt.class) {
                        if (aptt.p == null) {
                            aptt.p = (ahev)new ahcs((ahcz)aptt.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return aptt.a;
            }
            case 4: {
                return new ahcr((ahcz)aptt.a);
            }
            case 3: {
                return new aptt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aptt.a, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\f\u0007\u100a\r\b\u1409\u0006\t\u041b\n\u1409\u0007\u000b\u1409\n\f\u1009\u000b\r\u1409\u0005\u000e\u1409\b\u000f\u1008\t", new Object[] { "b", "c", "d", "e", "f", "g", "r", "o", "h", "i", aovp.class, "j", "m", "n", "q", "k", "l" });
            }
            case 1: {
                if (o == null) {
                    s = 0;
                }
                this.s = s;
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
