<?php
/**
 * The base configurations of the WordPress.
 *
 * This file has the following configurations: MySQL settings, Table Prefix,
 * Secret Keys, WordPress Language, and ABSPATH. You can find more information
 * by visiting {@link http://codex.wordpress.org/Editing_wp-config.php Editing
 * wp-config.php} Codex page. You can get the MySQL settings from your web host.
 *
 * This file is used by the wp-config.php creation script during the
 * installation. You don't have to use the web site, you can just copy this file
 * to "wp-config.php" and fill in the values.
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define('DB_NAME', 'u313276241_ybybu');

/** MySQL database username */
define('DB_USER', 'u313276241_ezuwy');

/** MySQL database password */
define('DB_PASSWORD', 'ySuWeHuvuW');

/** MySQL hostname */
define('DB_HOST', '127.0.0.1');

/** Database Charset to use in creating database tables. */
define('DB_CHARSET', 'utf8');

/** The Database Collate type. Don't change this if in doubt. */
define('DB_COLLATE', '');

/**#@+
 * Authentication Unique Keys and Salts.
 *
 * Change these to different unique phrases!
 * You can generate these using the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * You can change these at any point in time to invalidate all existing cookies. This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define('AUTH_KEY',         'HksBSNiyOrc3llvB6YoGrMPAnZKaXcH85uL83KX5jHVSk0vnMp0pJXLKpqh9tNhZ');
define('SECURE_AUTH_KEY',  'h52P1V0GjCisnEsZcHh8VlX9lv5GkUJZ0IazDjv8OzrrEow2FccqgooAKojuxp4Y');
define('LOGGED_IN_KEY',    'gJizETLBn9d8MevCtKrHLCm3v4s2wQAKMGxnfofFW2EwAbVMgrdxYMpcsZbs69DP');
define('NONCE_KEY',        'Y4LAfUlgbiaMdLAWYPKJhnoFJgMs5rpUgUCO2HjWbqSzMTsOBjlYKcKPD6PAD3Ng');
define('AUTH_SALT',        'y91iftsHq2NXrcK1uIVeT4gU53WPVPuak49DrUcKQ9Ia6CWiLrHPRLEgPTT8HhL8');
define('SECURE_AUTH_SALT', 'LvUFIHDSDPS6zSlX8KTx3TG5c7I8bG2ehh9MHcUFfwZpKwby6s59FuN7eeilDxWI');
define('LOGGED_IN_SALT',   'fA7Tx1kS8vPS6Ofxhv3TXvWbKfmyYUzTyeK1ReIjRkSPhh8mXxfAikNejZhanH7Q');
define('NONCE_SALT',       'EAEhY2iURUtFYhCdbyFNGzbCepoDgMKUOlz3r1YgifFEdkNxHsZm3TbNg4gMBpVp');

/**
 * Other customizations.
 */
define('FS_METHOD','direct');define('FS_CHMOD_DIR',0755);define('FS_CHMOD_FILE',0644);
define('WP_TEMP_DIR',dirname(__FILE__).'/wp-content/uploads');

/**
 * Turn off automatic updates since these are managed upstream.
 */
define('AUTOMATIC_UPDATER_DISABLED', true);


/**#@-*/

/**
 * WordPress Database Table prefix.
 *
 * You can have multiple installations in one database if you give each a unique
 * prefix. Only numbers, letters, and underscores please!
 */
$table_prefix  = 'hfcb_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 */
define('WP_DEBUG', false);

/* That's all, stop editing! Happy blogging. */

/** Absolute path to the WordPress directory. */
if ( !defined('ABSPATH') )
	define('ABSPATH', dirname(__FILE__) . '/');

/** Sets up WordPress vars and included files. */
require_once(ABSPATH . 'wp-settings.php');
