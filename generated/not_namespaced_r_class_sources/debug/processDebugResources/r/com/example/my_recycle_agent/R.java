/* AUTO-GENERATED FILE. DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found. It
 * should not be modified by hand.
 */

package com.example.my_recycle_agent;

public final class R {
  public static final class attr {
    /**
     * Alpha multiplier applied to the base color.
     * <p>May be a floating point value, such as "<code>1.2</code>".
     */
    public static final int alpha=0x7f010000;
    /**
     * The reference to the font file to be used. This should be a file in the res/font folder
     * and should therefore have an R reference value. E.g. @font/myfont
     * <p>May be a reference to another resource, in the form
     * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
     * attribute in the form
     * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
     */
    public static final int font=0x7f010001;
    /**
     * The authority of the Font Provider to be used for the request.
     * <p>May be a string value, using '\\;' to escape characters such as
     * '\\n' or '\\uxxxx' for a unicode character;
     */
    public static final int fontProviderAuthority=0x7f010002;
    /**
     * The sets of hashes for the certificates the provider should be signed with. This is
     * used to verify the identity of the provider, and is only required if the provider is not
     * part of the system image. This value may point to one list or a list of lists, where each
     * individual list represents one collection of signature hashes. Refer to your font provider's
     * documentation for these values.
     * <p>May be a reference to another resource, in the form
     * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
     * attribute in the form
     * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
     */
    public static final int fontProviderCerts=0x7f010003;
    /**
     * The strategy to be used when fetching font data from a font provider in XML layouts.
     * This attribute is ignored when the resource is loaded from code, as it is equivalent to the
     * choice of API between {@link
     * androidx.core.content.res.ResourcesCompat#getFont(Context, int)} (blocking) and
     * {@link
     * androidx.core.content.res.ResourcesCompat#getFont(Context, int, FontCallback, Handler)}
     * (async).
     * <p>Must be one of the following constant values.</p>
     * <table>
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
     * <tr><td>async</td><td>1</td><td>The async font fetch works as follows.
     * First, check the local cache, then if the requeted font is not cached, trigger a
     * request the font and continue with layout inflation. Once the font fetch succeeds, the
     * target text view will be refreshed with the downloaded font data. The
     * fontProviderFetchTimeout will be ignored if async loading is specified.</td></tr>
     * <tr><td>blocking</td><td>0</td><td>The blocking font fetch works as follows.
     * First, check the local cache, then if the requested font is not cached, request the
     * font from the provider and wait until it is finished.  You can change the length of
     * the timeout by modifying fontProviderFetchTimeout.  If the timeout happens, the
     * default typeface will be used instead.</td></tr>
     * </table>
     */
    public static final int fontProviderFetchStrategy=0x7f010004;
    /**
     * The length of the timeout during fetching.
     * <p>May be an integer value, such as "<code>100</code>".
     * <p>Must be one of the following constant values.</p>
     * <table>
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
     * <tr><td>forever</td><td>ffffffff</td><td>A special value for the timeout. In this case, the blocking font fetching will not
     * timeout and wait until a reply is received from the font provider.</td></tr>
     * </table>
     */
    public static final int fontProviderFetchTimeout=0x7f010005;
    /**
     * The package for the Font Provider to be used for the request. This is used to verify
     * the identity of the provider.
     * <p>May be a string value, using '\\;' to escape characters such as
     * '\\n' or '\\uxxxx' for a unicode character;
     */
    public static final int fontProviderPackage=0x7f010006;
    /**
     * The query to be sent over to the provider. Refer to your font provider's documentation
     * on the format of this string.
     * <p>May be a string value, using '\\;' to escape characters such as
     * '\\n' or '\\uxxxx' for a unicode character;
     */
    public static final int fontProviderQuery=0x7f010007;
    /**
     * The style of the given font file. This will be used when the font is being loaded into
     * the font stack and will override any style information in the font's header tables. If
     * unspecified, the value in the font's header tables will be used.
     * <p>Must be one of the following constant values.</p>
     * <table>
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
     * <tr><td>italic</td><td>1</td><td></td></tr>
     * <tr><td>normal</td><td>0</td><td></td></tr>
     * </table>
     */
    public static final int fontStyle=0x7f010008;
    /**
     * The variation settings to be applied to the font. The string should be in the following
     * format: "'tag1' value1, 'tag2' value2, ...". If the default variation settings should be
     * used, or the font used does not support variation settings, this attribute needs not be
     * specified.
     * <p>May be a string value, using '\\;' to escape characters such as
     * '\\n' or '\\uxxxx' for a unicode character;
     */
    public static final int fontVariationSettings=0x7f010009;
    /**
     * The weight of the given font file. This will be used when the font is being loaded into
     * the font stack and will override any weight information in the font's header tables. Must
     * be a positive number, a multiple of 100, and between 100 and 900, inclusive. The most
     * common values are 400 for regular weight and 700 for bold weight. If unspecified, the value
     * in the font's header tables will be used.
     * <p>May be an integer value, such as "<code>100</code>".
     */
    public static final int fontWeight=0x7f01000a;
    /**
     * The index of the font in the tcc font file. If the font file referenced is not in the
     * tcc format, this attribute needs not be specified.
     * <p>May be an integer value, such as "<code>100</code>".
     */
    public static final int ttcIndex=0x7f01000b;
  }
  public static final class color {
    public static final int notification_action_color_filter=0x7f020000;
    public static final int notification_icon_bg_color=0x7f020001;
    public static final int ripple_material_light=0x7f020002;
    public static final int secondary_text_default_material_light=0x7f020003;
  }
  public static final class dimen {
    public static final int compat_button_inset_horizontal_material=0x7f030000;
    public static final int compat_button_inset_vertical_material=0x7f030001;
    public static final int compat_button_padding_horizontal_material=0x7f030002;
    public static final int compat_button_padding_vertical_material=0x7f030003;
    public static final int compat_control_corner_material=0x7f030004;
    public static final int compat_notification_large_icon_max_height=0x7f030005;
    public static final int compat_notification_large_icon_max_width=0x7f030006;
    public static final int notification_action_icon_size=0x7f030007;
    public static final int notification_action_text_size=0x7f030008;
    public static final int notification_big_circle_margin=0x7f030009;
    public static final int notification_content_margin_start=0x7f03000a;
    public static final int notification_large_icon_height=0x7f03000b;
    public static final int notification_large_icon_width=0x7f03000c;
    public static final int notification_main_column_padding_top=0x7f03000d;
    public static final int notification_media_narrow_margin=0x7f03000e;
    public static final int notification_right_icon_size=0x7f03000f;
    public static final int notification_right_side_padding_top=0x7f030010;
    public static final int notification_small_icon_background_padding=0x7f030011;
    public static final int notification_small_icon_size_as_large=0x7f030012;
    public static final int notification_subtext_size=0x7f030013;
    public static final int notification_top_pad=0x7f030014;
    public static final int notification_top_pad_large_text=0x7f030015;
  }
  public static final class drawable {
    public static final int launch_background=0x7f040000;
    public static final int notification_action_background=0x7f040001;
    public static final int notification_bg=0x7f040002;
    public static final int notification_bg_low=0x7f040003;
    public static final int notification_bg_low_normal=0x7f040004;
    public static final int notification_bg_low_pressed=0x7f040005;
    public static final int notification_bg_normal=0x7f040006;
    public static final int notification_bg_normal_pressed=0x7f040007;
    public static final int notification_icon_background=0x7f040008;
    public static final int notification_template_icon_bg=0x7f040009;
    public static final int notification_template_icon_low_bg=0x7f04000a;
    public static final int notification_tile_bg=0x7f04000b;
    public static final int notify_panel_notification_icon_bg=0x7f04000c;
  }
  public static final class id {
    public static final int action_container=0x7f050000;
    public static final int action_divider=0x7f050001;
    public static final int action_image=0x7f050002;
    public static final int action_text=0x7f050003;
    public static final int actions=0x7f050004;
    public static final int async=0x7f050005;
    public static final int blocking=0x7f050006;
    public static final int chronometer=0x7f050007;
    public static final int forever=0x7f050008;
    public static final int icon=0x7f050009;
    public static final int icon_group=0x7f05000a;
    public static final int info=0x7f05000b;
    public static final int italic=0x7f05000c;
    public static final int line1=0x7f05000d;
    public static final int line3=0x7f05000e;
    public static final int normal=0x7f05000f;
    public static final int notification_background=0x7f050010;
    public static final int notification_main_column=0x7f050011;
    public static final int notification_main_column_container=0x7f050012;
    public static final int right_icon=0x7f050013;
    public static final int right_side=0x7f050014;
    public static final int tag_transition_group=0x7f050015;
    public static final int tag_unhandled_key_event_manager=0x7f050016;
    public static final int tag_unhandled_key_listeners=0x7f050017;
    public static final int text=0x7f050018;
    public static final int text2=0x7f050019;
    public static final int time=0x7f05001a;
    public static final int title=0x7f05001b;
  }
  public static final class integer {
    public static final int status_bar_notification_info_maxnum=0x7f060000;
  }
  public static final class layout {
    public static final int notification_action=0x7f070000;
    public static final int notification_action_tombstone=0x7f070001;
    public static final int notification_template_custom_big=0x7f070002;
    public static final int notification_template_icon_group=0x7f070003;
    public static final int notification_template_part_chronometer=0x7f070004;
    public static final int notification_template_part_time=0x7f070005;
  }
  public static final class mipmap {
    public static final int ic_launcher=0x7f080000;
  }
  public static final class string {
    public static final int status_bar_notification_info_overflow=0x7f090000;
  }
  public static final class style {
    public static final int LaunchTheme=0x7f0a0000;
    public static final int TextAppearance_Compat_Notification=0x7f0a0001;
    public static final int TextAppearance_Compat_Notification_Info=0x7f0a0002;
    public static final int TextAppearance_Compat_Notification_Line2=0x7f0a0003;
    public static final int TextAppearance_Compat_Notification_Time=0x7f0a0004;
    public static final int TextAppearance_Compat_Notification_Title=0x7f0a0005;
    public static final int Widget_Compat_NotificationActionContainer=0x7f0a0006;
    public static final int Widget_Compat_NotificationActionText=0x7f0a0007;
  }
  public static final class styleable {
    /**
     * Attributes that can be used with a ColorStateListItem.
     * <p>Includes the following attributes:</p>
     * <table>
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <tr><th>Attribute</th><th>Description</th></tr>
     * <tr><td><code>{@link #ColorStateListItem_android_color android:color}</code></td><td></td></tr>
     * <tr><td><code>{@link #ColorStateListItem_android_alpha android:alpha}</code></td><td></td></tr>
     * <tr><td><code>{@link #ColorStateListItem_alpha com.example.my_recycle_agent:alpha}</code></td><td>Alpha multiplier applied to the base color.</td></tr>
     * </table>
     * @see #ColorStateListItem_android_color
     * @see #ColorStateListItem_android_alpha
     * @see #ColorStateListItem_alpha
     */
    public static final int[] ColorStateListItem={
      0x010101a5, 0x0101031f, 0x7f010000
    };
    /**
     * <p>
     * @attr description
     * Base color for this state.
     *
     * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
     * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
     * "<code>#<i>aarrggbb</i></code>".
     *
     * @attr name android:color
     */
    public static final int ColorStateListItem_android_color=0;
    /**
     * <p>This symbol is the offset where the {@link android.R.attr#alpha}
     * attribute's value can be found in the {@link #ColorStateListItem} array.
     *
     * <p>May be a floating point value, such as "<code>1.2</code>".
     *
     * @attr name android:alpha
     */
    public static final int ColorStateListItem_android_alpha=1;
    /**
     * <p>
     * @attr description
     * Alpha multiplier applied to the base color.
     *
     * <p>May be a floating point value, such as "<code>1.2</code>".
     *
     * @attr name com.example.my_recycle_agent:alpha
     */
    public static final int ColorStateListItem_alpha=2;
    /**
     * Attributes that can be used with a FontFamily.
     * <p>Includes the following attributes:</p>
     * <table>
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <tr><th>Attribute</th><th>Description</th></tr>
     * <tr><td><code>{@link #FontFamily_fontProviderAuthority com.example.my_recycle_agent:fontProviderAuthority}</code></td><td>The authority of the Font Provider to be used for the request.</td></tr>
     * <tr><td><code>{@link #FontFamily_fontProviderCerts com.example.my_recycle_agent:fontProviderCerts}</code></td><td>The sets of hashes for the certificates the provider should be signed with.</td></tr>
     * <tr><td><code>{@link #FontFamily_fontProviderFetchStrategy com.example.my_recycle_agent:fontProviderFetchStrategy}</code></td><td>The strategy to be used when fetching font data from a font provider in XML layouts.</td></tr>
     * <tr><td><code>{@link #FontFamily_fontProviderFetchTimeout com.example.my_recycle_agent:fontProviderFetchTimeout}</code></td><td>The length of the timeout during fetching.</td></tr>
     * <tr><td><code>{@link #FontFamily_fontProviderPackage com.example.my_recycle_agent:fontProviderPackage}</code></td><td>The package for the Font Provider to be used for the request.</td></tr>
     * <tr><td><code>{@link #FontFamily_fontProviderQuery com.example.my_recycle_agent:fontProviderQuery}</code></td><td>The query to be sent over to the provider.</td></tr>
     * </table>
     * @see #FontFamily_fontProviderAuthority
     * @see #FontFamily_fontProviderCerts
     * @see #FontFamily_fontProviderFetchStrategy
     * @see #FontFamily_fontProviderFetchTimeout
     * @see #FontFamily_fontProviderPackage
     * @see #FontFamily_fontProviderQuery
     */
    public static final int[] FontFamily={
      0x7f010002, 0x7f010003, 0x7f010004, 0x7f010005, 
      0x7f010006, 0x7f010007
    };
    /**
     * <p>
     * @attr description
     * The authority of the Font Provider to be used for the request.
     *
     * <p>May be a string value, using '\\;' to escape characters such as
     * '\\n' or '\\uxxxx' for a unicode character;
     *
     * @attr name com.example.my_recycle_agent:fontProviderAuthority
     */
    public static final int FontFamily_fontProviderAuthority=0;
    /**
     * <p>
     * @attr description
     * The sets of hashes for the certificates the provider should be signed with. This is
     * used to verify the identity of the provider, and is only required if the provider is not
     * part of the system image. This value may point to one list or a list of lists, where each
     * individual list represents one collection of signature hashes. Refer to your font provider's
     * documentation for these values.
     *
     * <p>May be a reference to another resource, in the form
     * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
     * attribute in the form
     * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
     *
     * @attr name com.example.my_recycle_agent:fontProviderCerts
     */
    public static final int FontFamily_fontProviderCerts=1;
    /**
     * <p>
     * @attr description
     * The strategy to be used when fetching font data from a font provider in XML layouts.
     * This attribute is ignored when the resource is loaded from code, as it is equivalent to the
     * choice of API between {@link
     * androidx.core.content.res.ResourcesCompat#getFont(Context, int)} (blocking) and
     * {@link
     * androidx.core.content.res.ResourcesCompat#getFont(Context, int, FontCallback, Handler)}
     * (async).
     *
     * <p>Must be one of the following constant values.</p>
     * <table>
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
     * <tr><td>async</td><td>1</td><td>The async font fetch works as follows.
     * First, check the local cache, then if the requeted font is not cached, trigger a
     * request the font and continue with layout inflation. Once the font fetch succeeds, the
     * target text view will be refreshed with the downloaded font data. The
     * fontProviderFetchTimeout will be ignored if async loading is specified.</td></tr>
     * <tr><td>blocking</td><td>0</td><td>The blocking font fetch works as follows.
     * First, check the local cache, then if the requested font is not cached, request the
     * font from the provider and wait until it is finished.  You can change the length of
     * the timeout by modifying fontProviderFetchTimeout.  If the timeout happens, the
     * default typeface will be used instead.</td></tr>
     * </table>
     *
     * @attr name com.example.my_recycle_agent:fontProviderFetchStrategy
     */
    public static final int FontFamily_fontProviderFetchStrategy=2;
    /**
     * <p>
     * @attr description
     * The length of the timeout during fetching.
     *
     * <p>May be an integer value, such as "<code>100</code>".
     * <p>Must be one of the following constant values.</p>
     * <table>
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
     * <tr><td>forever</td><td>ffffffff</td><td>A special value for the timeout. In this case, the blocking font fetching will not
     * timeout and wait until a reply is received from the font provider.</td></tr>
     * </table>
     *
     * @attr name com.example.my_recycle_agent:fontProviderFetchTimeout
     */
    public static final int FontFamily_fontProviderFetchTimeout=3;
    /**
     * <p>
     * @attr description
     * The package for the Font Provider to be used for the request. This is used to verify
     * the identity of the provider.
     *
     * <p>May be a string value, using '\\;' to escape characters such as
     * '\\n' or '\\uxxxx' for a unicode character;
     *
     * @attr name com.example.my_recycle_agent:fontProviderPackage
     */
    public static final int FontFamily_fontProviderPackage=4;
    /**
     * <p>
     * @attr description
     * The query to be sent over to the provider. Refer to your font provider's documentation
     * on the format of this string.
     *
     * <p>May be a string value, using '\\;' to escape characters such as
     * '\\n' or '\\uxxxx' for a unicode character;
     *
     * @attr name com.example.my_recycle_agent:fontProviderQuery
     */
    public static final int FontFamily_fontProviderQuery=5;
    /**
     * Attributes that can be used with a FontFamilyFont.
     * <p>Includes the following attributes:</p>
     * <table>
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <tr><th>Attribute</th><th>Description</th></tr>
     * <tr><td><code>{@link #FontFamilyFont_android_font android:font}</code></td><td></td></tr>
     * <tr><td><code>{@link #FontFamilyFont_android_fontWeight android:fontWeight}</code></td><td></td></tr>
     * <tr><td><code>{@link #FontFamilyFont_android_fontStyle android:fontStyle}</code></td><td></td></tr>
     * <tr><td><code>{@link #FontFamilyFont_android_ttcIndex android:ttcIndex}</code></td><td></td></tr>
     * <tr><td><code>{@link #FontFamilyFont_android_fontVariationSettings android:fontVariationSettings}</code></td><td></td></tr>
     * <tr><td><code>{@link #FontFamilyFont_font com.example.my_recycle_agent:font}</code></td><td>The reference to the font file to be used.</td></tr>
     * <tr><td><code>{@link #FontFamilyFont_fontStyle com.example.my_recycle_agent:fontStyle}</code></td><td>The style of the given font file.</td></tr>
     * <tr><td><code>{@link #FontFamilyFont_fontVariationSettings com.example.my_recycle_agent:fontVariationSettings}</code></td><td>The variation settings to be applied to the font.</td></tr>
     * <tr><td><code>{@link #FontFamilyFont_fontWeight com.example.my_recycle_agent:fontWeight}</code></td><td>The weight of the given font file.</td></tr>
     * <tr><td><code>{@link #FontFamilyFont_ttcIndex com.example.my_recycle_agent:ttcIndex}</code></td><td>The index of the font in the tcc font file.</td></tr>
     * </table>
     * @see #FontFamilyFont_android_font
     * @see #FontFamilyFont_android_fontWeight
     * @see #FontFamilyFont_android_fontStyle
     * @see #FontFamilyFont_android_ttcIndex
     * @see #FontFamilyFont_android_fontVariationSettings
     * @see #FontFamilyFont_font
     * @see #FontFamilyFont_fontStyle
     * @see #FontFamilyFont_fontVariationSettings
     * @see #FontFamilyFont_fontWeight
     * @see #FontFamilyFont_ttcIndex
     */
    public static final int[] FontFamilyFont={
      0x01010532, 0x01010533, 0x0101053f, 0x0101056f, 
      0x01010570, 0x7f010001, 0x7f010008, 0x7f010009, 
      0x7f01000a, 0x7f01000b
    };
    /**
     * <p>This symbol is the offset where the {@link android.R.attr#font}
     * attribute's value can be found in the {@link #FontFamilyFont} array.
     *
     * <p>May be a reference to another resource, in the form
     * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
     * attribute in the form
     * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
     *
     * @attr name android:font
     */
    public static final int FontFamilyFont_android_font=0;
    /**
     * <p>This symbol is the offset where the {@link android.R.attr#fontWeight}
     * attribute's value can be found in the {@link #FontFamilyFont} array.
     *
     * <p>May be an integer value, such as "<code>100</code>".
     *
     * @attr name android:fontWeight
     */
    public static final int FontFamilyFont_android_fontWeight=1;
    /**
     * <p>
     * @attr description
     * References to the framework attrs
     *
     * <p>Must be one of the following constant values.</p>
     * <table>
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
     * <tr><td>italic</td><td>1</td><td></td></tr>
     * <tr><td>normal</td><td>0</td><td></td></tr>
     * </table>
     *
     * @attr name android:fontStyle
     */
    public static final int FontFamilyFont_android_fontStyle=2;
    /**
     * <p>This symbol is the offset where the {@link android.R.attr#ttcIndex}
     * attribute's value can be found in the {@link #FontFamilyFont} array.
     *
     * <p>May be an integer value, such as "<code>100</code>".
     *
     * @attr name android:ttcIndex
     */
    public static final int FontFamilyFont_android_ttcIndex=3;
    /**
     * <p>This symbol is the offset where the {@link android.R.attr#fontVariationSettings}
     * attribute's value can be found in the {@link #FontFamilyFont} array.
     *
     * <p>May be a string value, using '\\;' to escape characters such as
     * '\\n' or '\\uxxxx' for a unicode character;
     *
     * @attr name android:fontVariationSettings
     */
    public static final int FontFamilyFont_android_fontVariationSettings=4;
    /**
     * <p>
     * @attr description
     * The reference to the font file to be used. This should be a file in the res/font folder
     * and should therefore have an R reference value. E.g. @font/myfont
     *
     * <p>May be a reference to another resource, in the form
     * "<code>@[+][<i>package</i>:]<i>type</i>/<i>name</i></code>" or a theme
     * attribute in the form
     * "<code>?[<i>package</i>:]<i>type</i>/<i>name</i></code>".
     *
     * @attr name com.example.my_recycle_agent:font
     */
    public static final int FontFamilyFont_font=5;
    /**
     * <p>
     * @attr description
     * The style of the given font file. This will be used when the font is being loaded into
     * the font stack and will override any style information in the font's header tables. If
     * unspecified, the value in the font's header tables will be used.
     *
     * <p>Must be one of the following constant values.</p>
     * <table>
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
     * <tr><td>italic</td><td>1</td><td></td></tr>
     * <tr><td>normal</td><td>0</td><td></td></tr>
     * </table>
     *
     * @attr name com.example.my_recycle_agent:fontStyle
     */
    public static final int FontFamilyFont_fontStyle=6;
    /**
     * <p>
     * @attr description
     * The variation settings to be applied to the font. The string should be in the following
     * format: "'tag1' value1, 'tag2' value2, ...". If the default variation settings should be
     * used, or the font used does not support variation settings, this attribute needs not be
     * specified.
     *
     * <p>May be a string value, using '\\;' to escape characters such as
     * '\\n' or '\\uxxxx' for a unicode character;
     *
     * @attr name com.example.my_recycle_agent:fontVariationSettings
     */
    public static final int FontFamilyFont_fontVariationSettings=7;
    /**
     * <p>
     * @attr description
     * The weight of the given font file. This will be used when the font is being loaded into
     * the font stack and will override any weight information in the font's header tables. Must
     * be a positive number, a multiple of 100, and between 100 and 900, inclusive. The most
     * common values are 400 for regular weight and 700 for bold weight. If unspecified, the value
     * in the font's header tables will be used.
     *
     * <p>May be an integer value, such as "<code>100</code>".
     *
     * @attr name com.example.my_recycle_agent:fontWeight
     */
    public static final int FontFamilyFont_fontWeight=8;
    /**
     * <p>
     * @attr description
     * The index of the font in the tcc font file. If the font file referenced is not in the
     * tcc format, this attribute needs not be specified.
     *
     * <p>May be an integer value, such as "<code>100</code>".
     *
     * @attr name com.example.my_recycle_agent:ttcIndex
     */
    public static final int FontFamilyFont_ttcIndex=9;
    /**
     * Attributes that can be used with a GradientColor.
     * <p>Includes the following attributes:</p>
     * <table>
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <tr><th>Attribute</th><th>Description</th></tr>
     * <tr><td><code>{@link #GradientColor_android_startColor android:startColor}</code></td><td></td></tr>
     * <tr><td><code>{@link #GradientColor_android_endColor android:endColor}</code></td><td></td></tr>
     * <tr><td><code>{@link #GradientColor_android_type android:type}</code></td><td></td></tr>
     * <tr><td><code>{@link #GradientColor_android_centerX android:centerX}</code></td><td></td></tr>
     * <tr><td><code>{@link #GradientColor_android_centerY android:centerY}</code></td><td></td></tr>
     * <tr><td><code>{@link #GradientColor_android_gradientRadius android:gradientRadius}</code></td><td></td></tr>
     * <tr><td><code>{@link #GradientColor_android_tileMode android:tileMode}</code></td><td></td></tr>
     * <tr><td><code>{@link #GradientColor_android_centerColor android:centerColor}</code></td><td></td></tr>
     * <tr><td><code>{@link #GradientColor_android_startX android:startX}</code></td><td></td></tr>
     * <tr><td><code>{@link #GradientColor_android_startY android:startY}</code></td><td></td></tr>
     * <tr><td><code>{@link #GradientColor_android_endX android:endX}</code></td><td></td></tr>
     * <tr><td><code>{@link #GradientColor_android_endY android:endY}</code></td><td></td></tr>
     * </table>
     * @see #GradientColor_android_startColor
     * @see #GradientColor_android_endColor
     * @see #GradientColor_android_type
     * @see #GradientColor_android_centerX
     * @see #GradientColor_android_centerY
     * @see #GradientColor_android_gradientRadius
     * @see #GradientColor_android_tileMode
     * @see #GradientColor_android_centerColor
     * @see #GradientColor_android_startX
     * @see #GradientColor_android_startY
     * @see #GradientColor_android_endX
     * @see #GradientColor_android_endY
     */
    public static final int[] GradientColor={
      0x0101019d, 0x0101019e, 0x010101a1, 0x010101a2, 
      0x010101a3, 0x010101a4, 0x01010201, 0x0101020b, 
      0x01010510, 0x01010511, 0x01010512, 0x01010513
    };
    /**
     * <p>
     * @attr description
     * Start color of the gradient.
     *
     * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
     * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
     * "<code>#<i>aarrggbb</i></code>".
     *
     * @attr name android:startColor
     */
    public static final int GradientColor_android_startColor=0;
    /**
     * <p>
     * @attr description
     * End color of the gradient.
     *
     * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
     * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
     * "<code>#<i>aarrggbb</i></code>".
     *
     * @attr name android:endColor
     */
    public static final int GradientColor_android_endColor=1;
    /**
     * <p>
     * @attr description
     * Type of gradient. The default type is linear.
     *
     * <p>Must be one of the following constant values.</p>
     * <table>
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
     * <tr><td>linear</td><td>0</td><td></td></tr>
     * <tr><td>radial</td><td>1</td><td></td></tr>
     * <tr><td>sweep</td><td>2</td><td></td></tr>
     * </table>
     *
     * @attr name android:type
     */
    public static final int GradientColor_android_type=2;
    /**
     * <p>
     * @attr description
     * X coordinate of the center of the gradient within the path.
     *
     * <p>May be a floating point value, such as "<code>1.2</code>".
     * <p>May be a fractional value, which is a floating point number appended with
     * either % or %p, such as "<code>14.5%</code>".
     * The % suffix always means a percentage of the base size;
     * the optional %p suffix provides a size relative to some parent container.
     *
     * @attr name android:centerX
     */
    public static final int GradientColor_android_centerX=3;
    /**
     * <p>
     * @attr description
     * Y coordinate of the center of the gradient within the path.
     *
     * <p>May be a floating point value, such as "<code>1.2</code>".
     * <p>May be a fractional value, which is a floating point number appended with
     * either % or %p, such as "<code>14.5%</code>".
     * The % suffix always means a percentage of the base size;
     * the optional %p suffix provides a size relative to some parent container.
     *
     * @attr name android:centerY
     */
    public static final int GradientColor_android_centerY=4;
    /**
     * <p>
     * @attr description
     * Radius of the gradient, used only with radial gradient.
     *
     * <p>May be a floating point value, such as "<code>1.2</code>".
     * <p>May be a dimension value, which is a floating point number appended with a
     * unit such as "<code>14.5sp</code>".
     * Available units are: px (pixels), dp (density-independent pixels),
     * sp (scaled pixels based on preferred font size), in (inches), and
     * mm (millimeters).
     * <p>May be a fractional value, which is a floating point number appended with
     * either % or %p, such as "<code>14.5%</code>".
     * The % suffix always means a percentage of the base size;
     * the optional %p suffix provides a size relative to some parent container.
     *
     * @attr name android:gradientRadius
     */
    public static final int GradientColor_android_gradientRadius=5;
    /**
     * <p>
     * @attr description
     * Defines the tile mode of the gradient. SweepGradient doesn't support tiling.
     *
     * <p>Must be one of the following constant values.</p>
     * <table>
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
     * <tr><td>clamp</td><td>0</td><td></td></tr>
     * <tr><td>disabled</td><td>ffffffff</td><td></td></tr>
     * <tr><td>mirror</td><td>2</td><td></td></tr>
     * <tr><td>repeat</td><td>1</td><td></td></tr>
     * </table>
     *
     * @attr name android:tileMode
     */
    public static final int GradientColor_android_tileMode=6;
    /**
     * <p>
     * @attr description
     * Optional center color.
     *
     * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
     * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
     * "<code>#<i>aarrggbb</i></code>".
     *
     * @attr name android:centerColor
     */
    public static final int GradientColor_android_centerColor=7;
    /**
     * <p>
     * @attr description
     * X coordinate of the start point origin of the gradient.
     * Defined in same coordinates as the path itself
     *
     * <p>May be a floating point value, such as "<code>1.2</code>".
     *
     * @attr name android:startX
     */
    public static final int GradientColor_android_startX=8;
    /**
     * <p>
     * @attr description
     * Y coordinate of the start point of the gradient within the shape.
     * Defined in same coordinates as the path itself
     *
     * <p>May be a floating point value, such as "<code>1.2</code>".
     *
     * @attr name android:startY
     */
    public static final int GradientColor_android_startY=9;
    /**
     * <p>
     * @attr description
     * X coordinate of the end point origin of the gradient.
     * Defined in same coordinates as the path itself
     *
     * <p>May be a floating point value, such as "<code>1.2</code>".
     *
     * @attr name android:endX
     */
    public static final int GradientColor_android_endX=10;
    /**
     * <p>
     * @attr description
     * Y coordinate of the end point of the gradient within the shape.
     * Defined in same coordinates as the path itself
     *
     * <p>May be a floating point value, such as "<code>1.2</code>".
     *
     * @attr name android:endY
     */
    public static final int GradientColor_android_endY=11;
    /**
     * Attributes that can be used with a GradientColorItem.
     * <p>Includes the following attributes:</p>
     * <table>
     * <colgroup align="left" />
     * <colgroup align="left" />
     * <tr><th>Attribute</th><th>Description</th></tr>
     * <tr><td><code>{@link #GradientColorItem_android_color android:color}</code></td><td></td></tr>
     * <tr><td><code>{@link #GradientColorItem_android_offset android:offset}</code></td><td></td></tr>
     * </table>
     * @see #GradientColorItem_android_color
     * @see #GradientColorItem_android_offset
     */
    public static final int[] GradientColorItem={
      0x010101a5, 0x01010514
    };
    /**
     * <p>
     * @attr description
     * The current color for the offset inside the gradient.
     *
     * <p>May be a color value, in the form of "<code>#<i>rgb</i></code>",
     * "<code>#<i>argb</i></code>", "<code>#<i>rrggbb</i></code>", or
     * "<code>#<i>aarrggbb</i></code>".
     *
     * @attr name android:color
     */
    public static final int GradientColorItem_android_color=0;
    /**
     * <p>
     * @attr description
     * The offset (or ratio) of this current color item inside the gradient.
     * The value is only meaningful when it is between 0 and 1.
     *
     * <p>May be a floating point value, such as "<code>1.2</code>".
     *
     * @attr name android:offset
     */
    public static final int GradientColorItem_android_offset=1;
  }
  public static final class xml {
    public static final int flutter_image_picker_file_paths=0x7f0c0000;
  }
}