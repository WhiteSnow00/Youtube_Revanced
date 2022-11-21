import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.CompleteTransactionActionOuterClass$CompleteTransactionAction;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algx extends ahcz implements aheo
{
    public static final algx a;
    private static volatile ahev i;
    public int b;
    public int c;
    public Object d;
    public aknj e;
    public aisc f;
    public ahbt g;
    public int h;
    private ajxn j;
    private ahjl k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(algx.class, a = new algx());
    }
    
    private algx() {
        this.c = 0;
        this.l = 2;
        this.g = ahbt.b;
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
                final ahev i;
                if ((i = algx.i) == null) {
                    synchronized (algx.class) {
                        if (algx.i == null) {
                            algx.i = (ahev)new ahcs((ahcz)algx.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return algx.a;
            }
            case 4: {
                return new ahcr((ahcz)algx.a);
            }
            case 3: {
                return new algx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algx.a, "\u0001\b\u0001\u0001\u0001\u0309\b\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u143c\u0000\u0003\u143c\u0000\u0004\u100a\u0005\u0005\u1409\u0006\u0006\u100c\u0007\u0007\u1409\u0003\u0309\u1409\u0004", new Object[] { "d", "c", "b", "e", CompleteTransactionActionOuterClass$CompleteTransactionAction.class, aojk.class, "g", "k", "h", apvm.o, "f", "j" });
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
