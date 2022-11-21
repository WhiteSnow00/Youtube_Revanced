// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import androidx.customview.view.AbsSavedState;
import android.content.ActivityNotFoundException;
import android.view.KeyEvent;
import android.view.View$MeasureSpec;
import android.view.TouchDelegate;
import java.lang.reflect.Method;
import android.widget.AutoCompleteTextView;
import android.widget.ListAdapter;
import android.text.TextUtils;
import android.text.Editable;
import android.text.style.ImageSpan;
import android.text.SpannableStringBuilder;
import android.content.res.Resources;
import android.content.ComponentName;
import android.os.Parcelable;
import android.app.PendingIntent;
import android.util.Log;
import android.database.Cursor;
import android.net.Uri;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.content.Intent;
import android.text.TextWatcher;
import android.view.View$OnKeyListener;
import android.app.SearchableInfo;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;
import android.view.View$OnFocusChangeListener;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnClickListener;
import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;

public class SearchView extends mu implements ho
{
    static final boolean DBG = false;
    private static final String IME_OPTION_NO_MICROPHONE = "nm";
    static final String LOG_TAG = "SearchView";
    static final pb PRE_API_29_HIDDEN_METHOD_INVOKER;
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    public final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final CharSequence mDefaultQueryHint;
    private final View mDropDownAnchor;
    private boolean mExpandedInActionView;
    public final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final View$OnClickListener mOnClickListener;
    private oy mOnCloseListener;
    private final TextView$OnEditorActionListener mOnEditorActionListener;
    private final AdapterView$OnItemClickListener mOnItemClickListener;
    private final AdapterView$OnItemSelectedListener mOnItemSelectedListener;
    private oz mOnQueryChangeListener;
    public View$OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private View$OnClickListener mOnSearchClickListener;
    private pa mOnSuggestionListener;
    private final WeakHashMap mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private Runnable mReleaseCursorRunnable;
    public final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final View mSearchPlate;
    public final SearchView$SearchAutoComplete mSearchSrcTextView;
    private Rect mSearchSrcTextViewBounds;
    private Rect mSearchSrtTextViewBoundsExpanded;
    public SearchableInfo mSearchable;
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    public aqb mSuggestionsAdapter;
    private int[] mTemp;
    private int[] mTemp2;
    View$OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private pc mTouchDelegate;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    public final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;
    
    static {
        pb pre_API_29_HIDDEN_METHOD_INVOKER;
        if (Build$VERSION.SDK_INT < 29) {
            pre_API_29_HIDDEN_METHOD_INVOKER = new pb();
        }
        else {
            pre_API_29_HIDDEN_METHOD_INVOKER = null;
        }
        PRE_API_29_HIDDEN_METHOD_INVOKER = pre_API_29_HIDDEN_METHOD_INVOKER;
    }
    
    public SearchView(final Context context) {
        this(context, null);
    }
    
    public SearchView(final Context context, final AttributeSet set) {
        this(context, set, 2130970214);
    }
    
    public SearchView(final Context context, final AttributeSet set, int inputType) {
        super(context, set, inputType);
        this.mSearchSrcTextViewBounds = new Rect();
        this.mSearchSrtTextViewBoundsExpanded = new Rect();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        this.mUpdateDrawableStateRunnable = (Runnable)new be(this, 19);
        this.mReleaseCursorRunnable = (Runnable)new be(this, 20);
        this.mOutsideDrawablesCache = new WeakHashMap();
        final jm jm = new jm(this, 2);
        this.mOnClickListener = (View$OnClickListener)jm;
        this.mTextKeyListener = (View$OnKeyListener)new cfo(this, 1);
        final hee hee = new hee(this, 1);
        this.mOnEditorActionListener = (TextView$OnEditorActionListener)hee;
        final ov ov = new ov(this, 0);
        this.mOnItemClickListener = (AdapterView$OnItemClickListener)ov;
        final ow ow = new ow(this, 0);
        this.mOnItemSelectedListener = (AdapterView$OnItemSelectedListener)ow;
        this.mTextWatcher = (TextWatcher)new eyo(this, 1);
        final cdr w = cdr.w(context, set, gm.u, inputType, 0);
        anc.M((View)this, context, gm.u, set, (TypedArray)w.a, inputType, 0);
        LayoutInflater.from(context).inflate(w.i(17, 2131623961), (ViewGroup)this, true);
        final SearchView$SearchAutoComplete mSearchSrcTextView = (SearchView$SearchAutoComplete)this.findViewById(2131431307);
        this.mSearchSrcTextView = mSearchSrcTextView;
        mSearchSrcTextView.a = this;
        this.mSearchEditFrame = this.findViewById(2131431292);
        final View viewById = this.findViewById(2131431305);
        this.mSearchPlate = viewById;
        final View viewById2 = this.findViewById(2131431809);
        this.mSubmitArea = viewById2;
        final ImageView mSearchButton = (ImageView)this.findViewById(2131431287);
        this.mSearchButton = mSearchButton;
        final ImageView mGoButton = (ImageView)this.findViewById(2131431294);
        this.mGoButton = mGoButton;
        final ImageView mCloseButton = (ImageView)this.findViewById(2131431291);
        this.mCloseButton = mCloseButton;
        final ImageView mVoiceButton = (ImageView)this.findViewById(2131431312);
        this.mVoiceButton = mVoiceButton;
        final ImageView mCollapsedIcon = (ImageView)this.findViewById(2131431301);
        this.mCollapsedIcon = mCollapsedIcon;
        anc.Q(viewById, w.k(18));
        anc.Q(viewById2, w.k(23));
        mSearchButton.setImageDrawable(w.k(21));
        mGoButton.setImageDrawable(w.k(13));
        mCloseButton.setImageDrawable(w.k(10));
        mVoiceButton.setImageDrawable(w.k(26));
        mCollapsedIcon.setImageDrawable(w.k(21));
        this.mSearchHintIcon = w.k(20);
        pz.a((View)mSearchButton, (CharSequence)this.getResources().getString(2132017190));
        this.mSuggestionRowLayout = w.i(24, 2131623960);
        this.mSuggestionCommitIconResId = w.i(11, 0);
        mSearchButton.setOnClickListener((View$OnClickListener)jm);
        mCloseButton.setOnClickListener((View$OnClickListener)jm);
        mGoButton.setOnClickListener((View$OnClickListener)jm);
        mVoiceButton.setOnClickListener((View$OnClickListener)jm);
        mSearchSrcTextView.setOnClickListener((View$OnClickListener)jm);
        mSearchSrcTextView.addTextChangedListener(this.mTextWatcher);
        mSearchSrcTextView.setOnEditorActionListener((TextView$OnEditorActionListener)hee);
        mSearchSrcTextView.setOnItemClickListener((AdapterView$OnItemClickListener)ov);
        mSearchSrcTextView.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)ow);
        mSearchSrcTextView.setOnKeyListener(this.mTextKeyListener);
        mSearchSrcTextView.setOnFocusChangeListener((View$OnFocusChangeListener)new gci(this, 1));
        this.setIconifiedByDefault(w.p(16, true));
        inputType = w.e(2, -1);
        if (inputType != -1) {
            this.setMaxWidth(inputType);
        }
        this.mDefaultQueryHint = w.m(12);
        this.mQueryHint = w.m(19);
        inputType = w.f(6, -1);
        if (inputType != -1) {
            this.setImeOptions(inputType);
        }
        inputType = w.f(5, -1);
        if (inputType != -1) {
            this.setInputType(inputType);
        }
        this.setFocusable(w.p(1, true));
        w.o();
        final Intent mVoiceWebSearchIntent = new Intent("android.speech.action.WEB_SEARCH");
        (this.mVoiceWebSearchIntent = mVoiceWebSearchIntent).addFlags(268435456);
        mVoiceWebSearchIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        (this.mVoiceAppSearchIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH")).addFlags(268435456);
        final View viewById3 = this.findViewById(mSearchSrcTextView.getDropDownAnchor());
        if ((this.mDropDownAnchor = viewById3) != null) {
            viewById3.addOnLayoutChangeListener((View$OnLayoutChangeListener)new fto(this, 1));
        }
        this.updateViewsVisibility(this.mIconifiedByDefault);
        this.updateQueryHint();
    }
    
    private Intent createIntent(final String s, final Uri data, final String s2, final String s3, final int n, final String s4) {
        final Intent intent = new Intent(s);
        intent.addFlags(268435456);
        if (data != null) {
            intent.setData(data);
        }
        intent.putExtra("user_query", this.mUserQuery);
        if (s3 != null) {
            intent.putExtra("query", s3);
        }
        if (s2 != null) {
            intent.putExtra("intent_extra_data_key", s2);
        }
        final Bundle mAppSearchData = this.mAppSearchData;
        if (mAppSearchData != null) {
            intent.putExtra("app_data", mAppSearchData);
        }
        if (n != 0) {
            intent.putExtra("action_key", n);
            intent.putExtra("action_msg", s4);
        }
        intent.setComponent(this.mSearchable.getSearchActivity());
        return intent;
    }
    
    private Intent createIntentFromSuggestion(final Cursor cursor, int position, final String ex) {
        try {
            String s;
            if ((s = pk.c(cursor, "suggest_intent_action")) == null) {
                s = this.mSearchable.getSuggestIntentAction();
            }
            String s2;
            if ((s2 = s) == null) {
                s2 = "android.intent.action.SEARCH";
            }
            String s3;
            if ((s3 = pk.c(cursor, "suggest_intent_data")) == null) {
                s3 = this.mSearchable.getSuggestIntentData();
            }
            String string;
            if ((string = s3) != null) {
                final String c = pk.c(cursor, "suggest_intent_data_id");
                string = s3;
                if (c != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(s3);
                    sb.append("/");
                    sb.append(Uri.encode(c));
                    string = sb.toString();
                }
            }
            Uri parse;
            if (string == null) {
                parse = null;
            }
            else {
                parse = Uri.parse(string);
            }
            return this.createIntent(s2, parse, pk.c(cursor, "suggest_intent_extra_data"), pk.c(cursor, "suggest_intent_query"), position, (String)ex);
        }
        catch (final RuntimeException ex) {
            try {
                position = cursor.getPosition();
            }
            catch (final RuntimeException ex2) {
                position = -1;
            }
            final StringBuilder sb2 = new StringBuilder("Search suggestions cursor at row ");
            sb2.append(position);
            sb2.append(" returned exception.");
            Log.w("SearchView", sb2.toString(), (Throwable)ex);
            return null;
        }
    }
    
    private Intent createVoiceAppSearchIntent(final Intent intent, final SearchableInfo searchableInfo) {
        final ComponentName searchActivity = searchableInfo.getSearchActivity();
        final Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        final PendingIntent activity = PendingIntent.getActivity(this.getContext(), 0, intent2, 1107296256);
        final Bundle bundle = new Bundle();
        final Bundle mAppSearchData = this.mAppSearchData;
        if (mAppSearchData != null) {
            bundle.putParcelable("app_data", (Parcelable)mAppSearchData);
        }
        final Intent intent3 = new Intent(intent);
        final Resources resources = this.getResources();
        String string;
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            string = resources.getString(searchableInfo.getVoiceLanguageModeId());
        }
        else {
            string = "free_form";
        }
        final int voicePromptTextId = searchableInfo.getVoicePromptTextId();
        final String s = null;
        String string2;
        if (voicePromptTextId != 0) {
            string2 = resources.getString(searchableInfo.getVoicePromptTextId());
        }
        else {
            string2 = null;
        }
        String string3;
        if (searchableInfo.getVoiceLanguageId() != 0) {
            string3 = resources.getString(searchableInfo.getVoiceLanguageId());
        }
        else {
            string3 = null;
        }
        int voiceMaxResults;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            voiceMaxResults = searchableInfo.getVoiceMaxResults();
        }
        else {
            voiceMaxResults = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        String flattenToShortString;
        if (searchActivity == null) {
            flattenToShortString = s;
        }
        else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", flattenToShortString);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", (Parcelable)activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }
    
    private Intent createVoiceWebSearchIntent(final Intent intent, final SearchableInfo searchableInfo) {
        final Intent intent2 = new Intent(intent);
        final ComponentName searchActivity = searchableInfo.getSearchActivity();
        String flattenToShortString;
        if (searchActivity == null) {
            flattenToShortString = null;
        }
        else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", flattenToShortString);
        return intent2;
    }
    
    private void dismissSuggestions() {
        this.mSearchSrcTextView.dismissDropDown();
    }
    
    private void getChildBoundsWithinSearchView(final View view, final Rect rect) {
        view.getLocationInWindow(this.mTemp);
        this.getLocationInWindow(this.mTemp2);
        final int[] mTemp = this.mTemp;
        final int n = mTemp[1];
        final int[] mTemp2 = this.mTemp2;
        final int n2 = n - mTemp2[1];
        final int n3 = mTemp[0] - mTemp2[0];
        rect.set(n3, n2, view.getWidth() + n3, view.getHeight() + n2);
    }
    
    private CharSequence getDecoratedHint(final CharSequence charSequence) {
        if (this.mIconifiedByDefault && this.mSearchHintIcon != null) {
            final double n = this.mSearchSrcTextView.getTextSize();
            final Drawable mSearchHintIcon = this.mSearchHintIcon;
            Double.isNaN(n);
            final int n2 = (int)(n * 1.25);
            mSearchHintIcon.setBounds(0, 0, n2, n2);
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)"   ");
            spannableStringBuilder.setSpan((Object)new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return (CharSequence)spannableStringBuilder;
        }
        return charSequence;
    }
    
    private int getPreferredHeight() {
        return this.getContext().getResources().getDimensionPixelSize(2131165239);
    }
    
    private int getPreferredWidth() {
        return this.getContext().getResources().getDimensionPixelSize(2131165240);
    }
    
    private boolean hasVoiceSearch() {
        final SearchableInfo mSearchable = this.mSearchable;
        if (mSearchable != null && mSearchable.getVoiceSearchEnabled()) {
            Intent intent;
            if (this.mSearchable.getVoiceSearchLaunchWebSearch()) {
                intent = this.mVoiceWebSearchIntent;
            }
            else if (this.mSearchable.getVoiceSearchLaunchRecognizer()) {
                intent = this.mVoiceAppSearchIntent;
            }
            else {
                intent = null;
            }
            if (intent != null && this.getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }
    
    static boolean isLandscapeMode(final Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
    
    private boolean isSubmitAreaEnabled() {
        return (this.mSubmitButtonEnabled || this.mVoiceButtonEnabled) && !this.isIconified();
    }
    
    private void launchIntent(final Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            this.getContext().startActivity(intent);
        }
        catch (final RuntimeException ex) {
            new StringBuilder("Failed launch activity: ").append(intent);
            Log.e("SearchView", "Failed launch activity: ".concat(intent.toString()), (Throwable)ex);
        }
    }
    
    private boolean launchSuggestion(final int n, final int n2, final String s) {
        final Cursor d = this.mSuggestionsAdapter.d;
        if (d != null && d.moveToPosition(n)) {
            this.launchIntent(this.createIntentFromSuggestion(d, n2, s));
            return true;
        }
        return false;
    }
    
    private void postUpdateFocusedState() {
        this.post(this.mUpdateDrawableStateRunnable);
    }
    
    private void rewriteQueryFromSuggestion(final int n) {
        final Editable text = this.mSearchSrcTextView.getText();
        final Cursor d = this.mSuggestionsAdapter.d;
        if (d == null) {
            return;
        }
        if (!d.moveToPosition(n)) {
            this.setQuery((CharSequence)text);
            return;
        }
        final CharSequence b = this.mSuggestionsAdapter.b(d);
        if (b != null) {
            this.setQuery(b);
            return;
        }
        this.setQuery((CharSequence)text);
    }
    
    private void setQuery(final CharSequence text) {
        this.mSearchSrcTextView.setText(text);
        final SearchView$SearchAutoComplete mSearchSrcTextView = this.mSearchSrcTextView;
        int length;
        if (TextUtils.isEmpty(text)) {
            length = 0;
        }
        else {
            length = text.length();
        }
        mSearchSrcTextView.setSelection(length);
    }
    
    private void updateCloseButton() {
        final boolean b = TextUtils.isEmpty((CharSequence)this.mSearchSrcTextView.getText()) ^ true;
        int visibility = 0;
        final boolean b2 = b || (this.mIconifiedByDefault && !this.mExpandedInActionView);
        final ImageView mCloseButton = this.mCloseButton;
        if (!b2) {
            visibility = 8;
        }
        mCloseButton.setVisibility(visibility);
        final Drawable drawable = this.mCloseButton.getDrawable();
        if (drawable != null) {
            int[] state;
            if (b) {
                state = SearchView.ENABLED_STATE_SET;
            }
            else {
                state = SearchView.EMPTY_STATE_SET;
            }
            drawable.setState(state);
        }
    }
    
    private void updateQueryHint() {
        CharSequence queryHint;
        if ((queryHint = this.getQueryHint()) == null) {
            queryHint = "";
        }
        this.mSearchSrcTextView.setHint(this.getDecoratedHint(queryHint));
    }
    
    private void updateSearchAutoComplete() {
        this.mSearchSrcTextView.setThreshold(this.mSearchable.getSuggestThreshold());
        this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
        final int inputType = this.mSearchable.getInputType();
        final int n = 1;
        int inputType2 = inputType;
        if ((inputType & 0xF) == 0x1) {
            inputType2 = (inputType & 0xFFFEFFFF);
            if (this.mSearchable.getSuggestAuthority() != null) {
                inputType2 |= 0x90000;
            }
        }
        this.mSearchSrcTextView.setInputType(inputType2);
        final aqb mSuggestionsAdapter = this.mSuggestionsAdapter;
        if (mSuggestionsAdapter != null) {
            mSuggestionsAdapter.d((Cursor)null);
        }
        if (this.mSearchable.getSuggestAuthority() != null) {
            final pk pk = new pk(this.getContext(), this, this.mSearchable, this.mOutsideDrawablesCache);
            this.mSuggestionsAdapter = (aqb)pk;
            this.mSearchSrcTextView.setAdapter((ListAdapter)pk);
            final pk pk2 = (pk)this.mSuggestionsAdapter;
            int a;
            if (!this.mQueryRefinement) {
                a = n;
            }
            else {
                a = 2;
            }
            pk2.a = a;
        }
    }
    
    private void updateSubmitArea() {
        final boolean submitAreaEnabled = this.isSubmitAreaEnabled();
        int visibility = 8;
        Label_0038: {
            if (submitAreaEnabled) {
                if (this.mGoButton.getVisibility() != 0) {
                    visibility = visibility;
                    if (this.mVoiceButton.getVisibility() != 0) {
                        break Label_0038;
                    }
                }
                visibility = 0;
            }
        }
        this.mSubmitArea.setVisibility(visibility);
    }
    
    private void updateSubmitButton(final boolean b) {
        final boolean mSubmitButtonEnabled = this.mSubmitButtonEnabled;
        int visibility;
        final int n = visibility = 8;
        Label_0049: {
            if (mSubmitButtonEnabled) {
                visibility = n;
                if (this.isSubmitAreaEnabled()) {
                    visibility = n;
                    if (this.hasFocus()) {
                        if (!b) {
                            visibility = n;
                            if (this.mVoiceButtonEnabled) {
                                break Label_0049;
                            }
                        }
                        visibility = 0;
                    }
                }
            }
        }
        this.mGoButton.setVisibility(visibility);
    }
    
    private void updateViewsVisibility(final boolean mIconified) {
        this.mIconified = mIconified;
        final boolean empty = TextUtils.isEmpty((CharSequence)this.mSearchSrcTextView.getText());
        final int n = 0;
        int visibility;
        if (!mIconified) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        this.mSearchButton.setVisibility(visibility);
        this.updateSubmitButton(empty ^ true);
        final View mSearchEditFrame = this.mSearchEditFrame;
        int visibility2;
        if (!mIconified) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        mSearchEditFrame.setVisibility(visibility2);
        int visibility3 = 0;
        Label_0095: {
            if (this.mCollapsedIcon.getDrawable() != null) {
                visibility3 = n;
                if (!this.mIconifiedByDefault) {
                    break Label_0095;
                }
            }
            visibility3 = 8;
        }
        this.mCollapsedIcon.setVisibility(visibility3);
        this.updateCloseButton();
        this.updateVoiceButton(empty);
        this.updateSubmitArea();
    }
    
    private void updateVoiceButton(final boolean b) {
        final boolean mVoiceButtonEnabled = this.mVoiceButtonEnabled;
        int visibility;
        final int n = visibility = 8;
        if (mVoiceButtonEnabled) {
            visibility = n;
            if (!this.isIconified()) {
                visibility = n;
                if (b) {
                    this.mGoButton.setVisibility(8);
                    visibility = 0;
                }
            }
        }
        this.mVoiceButton.setVisibility(visibility);
    }
    
    public void adjustDropDownSizeAndPosition() {
        if (this.mDropDownAnchor.getWidth() > 1) {
            final Resources resources = this.getContext().getResources();
            final int paddingLeft = this.mSearchPlate.getPaddingLeft();
            final Rect rect = new Rect();
            final boolean b = qc.b((View)this);
            int n;
            if (this.mIconifiedByDefault) {
                n = resources.getDimensionPixelSize(2131165226) + resources.getDimensionPixelSize(2131165227);
            }
            else {
                n = 0;
            }
            this.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
            int dropDownHorizontalOffset;
            if (b) {
                dropDownHorizontalOffset = -rect.left;
            }
            else {
                dropDownHorizontalOffset = paddingLeft - (rect.left + n);
            }
            this.mSearchSrcTextView.setDropDownHorizontalOffset(dropDownHorizontalOffset);
            this.mSearchSrcTextView.setDropDownWidth(this.mDropDownAnchor.getWidth() + rect.left + rect.right + n - paddingLeft);
        }
    }
    
    public void clearFocus() {
        this.mClearingFocus = true;
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mSearchSrcTextView.b(false);
        this.mClearingFocus = false;
    }
    
    public void forceSuggestionQuery() {
        if (Build$VERSION.SDK_INT >= 29) {
            ox.a((AutoCompleteTextView)this.mSearchSrcTextView);
            return;
        }
        final pb pre_API_29_HIDDEN_METHOD_INVOKER = SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER;
        final SearchView$SearchAutoComplete mSearchSrcTextView = this.mSearchSrcTextView;
        pb.a();
        final Object a = pre_API_29_HIDDEN_METHOD_INVOKER.a;
        if (a != null) {
            try {
                ((Method)a).invoke(mSearchSrcTextView, new Object[0]);
            }
            catch (final Exception ex) {}
        }
        final pb pre_API_29_HIDDEN_METHOD_INVOKER2 = SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER;
        final SearchView$SearchAutoComplete mSearchSrcTextView2 = this.mSearchSrcTextView;
        pb.a();
        final Object b = pre_API_29_HIDDEN_METHOD_INVOKER2.b;
        if (b == null) {
            return;
        }
        try {
            ((Method)b).invoke(mSearchSrcTextView2, new Object[0]);
        }
        catch (final Exception ex2) {}
    }
    
    public int getImeOptions() {
        return this.mSearchSrcTextView.getImeOptions();
    }
    
    public int getInputType() {
        return this.mSearchSrcTextView.getInputType();
    }
    
    public int getMaxWidth() {
        return this.mMaxWidth;
    }
    
    public CharSequence getQuery() {
        return (CharSequence)this.mSearchSrcTextView.getText();
    }
    
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.mQueryHint;
        if (charSequence == null) {
            final SearchableInfo mSearchable = this.mSearchable;
            if (mSearchable != null && mSearchable.getHintId() != 0) {
                charSequence = this.getContext().getText(this.mSearchable.getHintId());
            }
            else {
                charSequence = this.mDefaultQueryHint;
            }
        }
        return charSequence;
    }
    
    public int getSuggestionCommitIconResId() {
        return this.mSuggestionCommitIconResId;
    }
    
    public int getSuggestionRowLayout() {
        return this.mSuggestionRowLayout;
    }
    
    public aqb getSuggestionsAdapter() {
        return this.mSuggestionsAdapter;
    }
    
    public boolean isIconfiedByDefault() {
        return this.mIconifiedByDefault;
    }
    
    public boolean isIconified() {
        return this.mIconified;
    }
    
    public boolean isQueryRefinementEnabled() {
        return this.mQueryRefinement;
    }
    
    public boolean isSubmitButtonEnabled() {
        return this.mSubmitButtonEnabled;
    }
    
    public void launchQuerySearch(final int n, final String s, final String s2) {
        this.getContext().startActivity(this.createIntent("android.intent.action.SEARCH", null, null, s2, n, s));
    }
    
    public void onActionViewCollapsed() {
        this.setQuery("", false);
        this.clearFocus();
        this.updateViewsVisibility(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }
    
    public void onActionViewExpanded() {
        if (this.mExpandedInActionView) {
            return;
        }
        this.mExpandedInActionView = true;
        final int imeOptions = this.mSearchSrcTextView.getImeOptions();
        this.mCollapsedImeOptions = imeOptions;
        this.mSearchSrcTextView.setImeOptions(imeOptions | 0x2000000);
        this.mSearchSrcTextView.setText((CharSequence)"");
        this.setIconified(false);
    }
    
    public void onCloseClicked() {
        if (TextUtils.isEmpty((CharSequence)this.mSearchSrcTextView.getText())) {
            if (this.mIconifiedByDefault) {
                final oy mOnCloseListener = this.mOnCloseListener;
                if (mOnCloseListener == null || !mOnCloseListener.a()) {
                    this.clearFocus();
                    this.updateViewsVisibility(true);
                }
            }
            return;
        }
        this.mSearchSrcTextView.setText((CharSequence)"");
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.b(true);
    }
    
    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.mUpdateDrawableStateRunnable);
        this.post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }
    
    public boolean onItemClicked(final int n, final int n2, final String s) {
        final pa mOnSuggestionListener = this.mOnSuggestionListener;
        if (mOnSuggestionListener != null && mOnSuggestionListener.a()) {
            return false;
        }
        this.launchSuggestion(n, 0, null);
        this.mSearchSrcTextView.b(false);
        this.dismissSuggestions();
        return true;
    }
    
    public boolean onItemSelected(final int n) {
        final pa mOnSuggestionListener = this.mOnSuggestionListener;
        if (mOnSuggestionListener != null && mOnSuggestionListener.b()) {
            return false;
        }
        this.rewriteQueryFromSuggestion(n);
        return true;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.getChildBoundsWithinSearchView((View)this.mSearchSrcTextView, this.mSearchSrcTextViewBounds);
            this.mSearchSrtTextViewBoundsExpanded.set(this.mSearchSrcTextViewBounds.left, 0, this.mSearchSrcTextViewBounds.right, n4 - n2);
            final pc mTouchDelegate = this.mTouchDelegate;
            if (mTouchDelegate == null) {
                this.setTouchDelegate((TouchDelegate)(this.mTouchDelegate = new pc(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds, (View)this.mSearchSrcTextView)));
                return;
            }
            mTouchDelegate.a(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds);
        }
    }
    
    protected void onMeasure(int n, int n2) {
        if (this.isIconified()) {
            super.onMeasure(n, n2);
            return;
        }
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    n = size;
                }
                else {
                    final int mMaxWidth = this.mMaxWidth;
                    n = size;
                    if (mMaxWidth > 0) {
                        n = Math.min(mMaxWidth, size);
                    }
                }
            }
            else if ((n = this.mMaxWidth) <= 0) {
                n = this.getPreferredWidth();
            }
        }
        else {
            n = this.mMaxWidth;
            if (n > 0) {
                n = Math.min(n, size);
            }
            else {
                n = Math.min(this.getPreferredWidth(), size);
            }
        }
        final int mode2 = View$MeasureSpec.getMode(n2);
        n2 = View$MeasureSpec.getSize(n2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                n2 = this.getPreferredHeight();
            }
        }
        else {
            n2 = Math.min(this.getPreferredHeight(), n2);
        }
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(n, 1073741824), View$MeasureSpec.makeMeasureSpec(n2, 1073741824));
    }
    
    public void onQueryRefine(final CharSequence query) {
        this.setQuery(query);
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof SearchView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final SearchView$SavedState searchView$SavedState = (SearchView$SavedState)parcelable;
        super.onRestoreInstanceState(((AbsSavedState)searchView$SavedState).d);
        this.updateViewsVisibility(searchView$SavedState.a);
        this.requestLayout();
    }
    
    protected Parcelable onSaveInstanceState() {
        final SearchView$SavedState searchView$SavedState = new SearchView$SavedState(super.onSaveInstanceState());
        searchView$SavedState.a = this.isIconified();
        return (Parcelable)searchView$SavedState;
    }
    
    public void onSearchClicked() {
        this.updateViewsVisibility(false);
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.b(true);
        final View$OnClickListener mOnSearchClickListener = this.mOnSearchClickListener;
        if (mOnSearchClickListener != null) {
            mOnSearchClickListener.onClick((View)this);
        }
    }
    
    public void onSubmitQuery() {
        final Editable text = this.mSearchSrcTextView.getText();
        if (text != null && TextUtils.getTrimmedLength((CharSequence)text) > 0) {
            final oz mOnQueryChangeListener = this.mOnQueryChangeListener;
            if (mOnQueryChangeListener != null) {
                text.toString();
                if (mOnQueryChangeListener.b()) {
                    return;
                }
            }
            if (this.mSearchable != null) {
                this.launchQuerySearch(0, null, text.toString());
            }
            this.mSearchSrcTextView.b(false);
            this.dismissSuggestions();
        }
    }
    
    public boolean onSuggestionsKey(final View view, int length, final KeyEvent keyEvent) {
        if (this.mSearchable == null) {
            return false;
        }
        if (this.mSuggestionsAdapter == null) {
            return false;
        }
        if (keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (length != 66 && length != 84 && length != 61) {
                if (length != 21) {
                    if (length == 22) {
                        length = this.mSearchSrcTextView.length();
                    }
                    else {
                        if (length == 19) {
                            this.mSearchSrcTextView.getListSelection();
                            return false;
                        }
                        return false;
                    }
                }
                else {
                    length = 0;
                }
                this.mSearchSrcTextView.setSelection(length);
                this.mSearchSrcTextView.setListSelection(0);
                this.mSearchSrcTextView.clearListSelection();
                this.mSearchSrcTextView.a();
                return true;
            }
            return this.onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, null);
        }
        return false;
    }
    
    public void onTextChanged(final CharSequence charSequence) {
        final Editable text = this.mSearchSrcTextView.getText();
        this.mUserQuery = (CharSequence)text;
        final boolean empty = TextUtils.isEmpty((CharSequence)text);
        this.updateSubmitButton(empty ^ true);
        this.updateVoiceButton(empty);
        this.updateCloseButton();
        this.updateSubmitArea();
        if (this.mOnQueryChangeListener != null && !TextUtils.equals(charSequence, this.mOldQueryText)) {
            final oz mOnQueryChangeListener = this.mOnQueryChangeListener;
            charSequence.toString();
            mOnQueryChangeListener.a();
        }
        this.mOldQueryText = charSequence.toString();
    }
    
    public void onTextFocusChanged() {
        this.updateViewsVisibility(this.isIconified());
        this.postUpdateFocusedState();
        if (this.mSearchSrcTextView.hasFocus()) {
            this.forceSuggestionQuery();
        }
    }
    
    public void onVoiceClicked() {
        final SearchableInfo mSearchable = this.mSearchable;
        if (mSearchable != null) {
            try {
                if (mSearchable.getVoiceSearchLaunchWebSearch()) {
                    this.getContext().startActivity(this.createVoiceWebSearchIntent(this.mVoiceWebSearchIntent, mSearchable));
                    return;
                }
                if (mSearchable.getVoiceSearchLaunchRecognizer()) {
                    this.getContext().startActivity(this.createVoiceAppSearchIntent(this.mVoiceAppSearchIntent, mSearchable));
                }
            }
            catch (final ActivityNotFoundException ex) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        this.postUpdateFocusedState();
    }
    
    public boolean requestFocus(final int n, final Rect rect) {
        if (this.mClearingFocus) {
            return false;
        }
        if (!this.isFocusable()) {
            return false;
        }
        if (!this.isIconified()) {
            final boolean requestFocus = this.mSearchSrcTextView.requestFocus(n, rect);
            if (requestFocus) {
                this.updateViewsVisibility(false);
            }
            return requestFocus;
        }
        return super.requestFocus(n, rect);
    }
    
    public void setAppSearchData(final Bundle mAppSearchData) {
        this.mAppSearchData = mAppSearchData;
    }
    
    public void setIconified(final boolean b) {
        if (b) {
            this.onCloseClicked();
            return;
        }
        this.onSearchClicked();
    }
    
    public void setIconifiedByDefault(final boolean mIconifiedByDefault) {
        if (this.mIconifiedByDefault == mIconifiedByDefault) {
            return;
        }
        this.updateViewsVisibility(this.mIconifiedByDefault = mIconifiedByDefault);
        this.updateQueryHint();
    }
    
    public void setImeOptions(final int imeOptions) {
        this.mSearchSrcTextView.setImeOptions(imeOptions);
    }
    
    public void setInputType(final int inputType) {
        this.mSearchSrcTextView.setInputType(inputType);
    }
    
    public void setMaxWidth(final int mMaxWidth) {
        this.mMaxWidth = mMaxWidth;
        this.requestLayout();
    }
    
    public void setOnCloseListener(final oy mOnCloseListener) {
        this.mOnCloseListener = mOnCloseListener;
    }
    
    public void setOnQueryTextFocusChangeListener(final View$OnFocusChangeListener mOnQueryTextFocusChangeListener) {
        this.mOnQueryTextFocusChangeListener = mOnQueryTextFocusChangeListener;
    }
    
    public void setOnQueryTextListener(final oz mOnQueryChangeListener) {
        this.mOnQueryChangeListener = mOnQueryChangeListener;
    }
    
    public void setOnSearchClickListener(final View$OnClickListener mOnSearchClickListener) {
        this.mOnSearchClickListener = mOnSearchClickListener;
    }
    
    public void setOnSuggestionListener(final pa mOnSuggestionListener) {
        this.mOnSuggestionListener = mOnSuggestionListener;
    }
    
    public void setQuery(final CharSequence charSequence, final boolean b) {
        this.mSearchSrcTextView.setText(charSequence);
        if (charSequence != null) {
            final SearchView$SearchAutoComplete mSearchSrcTextView = this.mSearchSrcTextView;
            mSearchSrcTextView.setSelection(mSearchSrcTextView.length());
            this.mUserQuery = charSequence;
        }
        if (b && !TextUtils.isEmpty(charSequence)) {
            this.onSubmitQuery();
        }
    }
    
    public void setQueryHint(final CharSequence mQueryHint) {
        this.mQueryHint = mQueryHint;
        this.updateQueryHint();
    }
    
    public void setQueryRefinementEnabled(final boolean mQueryRefinement) {
        this.mQueryRefinement = mQueryRefinement;
        final aqb mSuggestionsAdapter = this.mSuggestionsAdapter;
        if (mSuggestionsAdapter instanceof pk) {
            final pk pk = (pk)mSuggestionsAdapter;
            int a = 1;
            if (mQueryRefinement) {
                a = 2;
            }
            pk.a = a;
        }
    }
    
    public void setSearchableInfo(final SearchableInfo mSearchable) {
        this.mSearchable = mSearchable;
        if (mSearchable != null) {
            this.updateSearchAutoComplete();
            this.updateQueryHint();
        }
        final boolean hasVoiceSearch = this.hasVoiceSearch();
        this.mVoiceButtonEnabled = hasVoiceSearch;
        if (hasVoiceSearch) {
            this.mSearchSrcTextView.setPrivateImeOptions("nm");
        }
        this.updateViewsVisibility(this.isIconified());
    }
    
    public void setSubmitButtonEnabled(final boolean mSubmitButtonEnabled) {
        this.mSubmitButtonEnabled = mSubmitButtonEnabled;
        this.updateViewsVisibility(this.isIconified());
    }
    
    public void setSuggestionsAdapter(final aqb aqb) {
        this.mSuggestionsAdapter = aqb;
        this.mSearchSrcTextView.setAdapter((ListAdapter)aqb);
    }
    
    public void updateFocusedState() {
        int[] array;
        if (this.mSearchSrcTextView.hasFocus()) {
            array = SearchView.FOCUSED_STATE_SET;
        }
        else {
            array = SearchView.EMPTY_STATE_SET;
        }
        final Drawable background = this.mSearchPlate.getBackground();
        if (background != null) {
            background.setState(array);
        }
        final Drawable background2 = this.mSubmitArea.getBackground();
        if (background2 != null) {
            background2.setState(array);
        }
        this.invalidate();
    }
}
